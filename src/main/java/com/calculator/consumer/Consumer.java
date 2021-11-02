package com.calculator.consumer;

import java.math.BigDecimal;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.calculator.constants.RabbitMQConstants;
import com.calculator.dto.RabbitMQDto;
import com.calculator.service.SumService;
@Component
public class Consumer {
	
	@Autowired
	SumService sumService;
	
	@RabbitListener(queues = RabbitMQConstants.FILA_SOMA)
	public void consumer(RabbitMQDto rabbitMQDto){
		
		BigDecimal result =sumService.sum(rabbitMQDto.firstNumber, rabbitMQDto.secondNumber);
		System.out.println(result);
	}

}
