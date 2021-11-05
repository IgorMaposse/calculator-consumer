package com.calculator.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class SubService {
	public BigDecimal sub(String a, String b) {
		BigDecimal number1 = new BigDecimal(a);
		BigDecimal number2 = new BigDecimal(b);
		return number1.subtract(number2);
	}

}
