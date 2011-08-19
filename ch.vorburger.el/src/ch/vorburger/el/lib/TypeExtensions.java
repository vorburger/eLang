package ch.vorburger.el.lib;

import java.math.BigDecimal;

public class TypeExtensions {

	public static BigDecimal operator_plus(BigDecimal x, BigDecimal y) {
		if(y!=null) {
			return x.add(y);
		} else {
			return x;
		}
	}

	public static BigDecimal operator_minus(BigDecimal x, BigDecimal y) {
		return x.subtract(y);
	}

	public static BigDecimal operator_multiply(BigDecimal x, BigDecimal y) {
		return x.multiply(y);
	}

	public static BigDecimal operator_divide(BigDecimal x, BigDecimal y) {
		return x.divide(y);
	}
	
	public static BigDecimal operator_minus(BigDecimal x) {
		return x.negate();
	}
	
}
