package com.calculator.operations;

import java.math.BigDecimal;

public class Mul implements Operation {

	public BigDecimal calculate(BigDecimal a, BigDecimal b) {
		return a.multiply(b);
	}

}