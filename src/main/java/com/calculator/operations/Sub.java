package com.calculator.operations;

import java.math.BigDecimal;

public class Sub implements Operation {

	public BigDecimal calculate(BigDecimal a, BigDecimal b) {
		return a.subtract(b);
	}

}
