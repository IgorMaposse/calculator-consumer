package com.calculator.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class MulService {
	public BigDecimal mul(String a, String b) {
		BigDecimal number1 = new BigDecimal(a);
		BigDecimal number2 = new BigDecimal(b);
		return number1.multiply(number2);
	}

}
