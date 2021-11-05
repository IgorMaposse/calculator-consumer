package com.calculator.consumer;

import java.math.BigDecimal;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.calculator.constants.RabbitMQConstants;
import com.calculator.dto.RabbitMQDto;
import com.calculator.service.DivService;
import com.calculator.service.MulService;
import com.calculator.service.SubService;
import com.calculator.service.SumService;
@Component
public class Consumer {
	
	@Autowired
	SumService sumService;
	
	@Autowired
	SubService subService;
	
	@Autowired
	MulService mulService;
	
	@Autowired
	DivService divService;
	

	@RabbitListener(queues = RabbitMQConstants.FILA_SUM)
	public void consumerSum(RabbitMQDto rabbitMQDto){
		
		BigDecimal result =sumService.sum(rabbitMQDto.firstNumber, rabbitMQDto.secondNumber);
		System.out.println(result);
		
	}
	
	@RabbitListener(queues = RabbitMQConstants.FILA_SUBT)
	public void consumerSub( RabbitMQDto rabbitMQDto){
		
		BigDecimal result =subService.sub(rabbitMQDto.firstNumber, rabbitMQDto.secondNumber);
		System.out.println(result);
		
	}
	
	@RabbitListener(queues = RabbitMQConstants.FILA_MULT)
	public void consumerMul(RabbitMQDto rabbitMQDto){
		
		BigDecimal result =mulService.mul(rabbitMQDto.firstNumber, rabbitMQDto.secondNumber);
		System.out.println(result);
		
	}
	
	@RabbitListener(queues = RabbitMQConstants.FILA_DIV)
	public void consumerDiv(RabbitMQDto rabbitMQDto){
		
		BigDecimal result =divService.div(rabbitMQDto.firstNumber, rabbitMQDto.secondNumber);
		System.out.println(result);
		
	}
	

}
