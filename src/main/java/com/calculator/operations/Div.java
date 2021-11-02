package com.calculator.operations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Div implements Operation {

	public BigDecimal calculate(BigDecimal a, BigDecimal b) {
    	if ( b.equals(BigDecimal.ZERO) )
    		throw new IllegalArgumentException("Division by 0");
    	
		return a.divide(b, 6, RoundingMode.CEILING);
	}

}
