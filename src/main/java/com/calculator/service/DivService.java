package com.calculator.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Component;

@Component
public class DivService {
	
	public BigDecimal div(String a, String b) {
		
		BigDecimal number1 = new BigDecimal(a);
		BigDecimal number2 = new BigDecimal(b);
	
		if ( number2.equals(BigDecimal.ZERO) )
    		throw new IllegalArgumentException("Division by 0");
    	
		return number1.divide(number2, 6, RoundingMode.CEILING);

	}

}
