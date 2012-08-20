package ch.vorburger.el.lib;

import java.math.BigDecimal;

/**
 * This class provides extensions for expressions that deal with the handling of decimal numbers.
 * 
 * @author Kai Kreuzer
 *
 */
public class DecimalExtensions {

	public static BigDecimal operator_plus(BigDecimal x, BigDecimal y) {
		return x.add(y);
	}

	public static BigDecimal operator_minus(BigDecimal x) {
		return x.negate();
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

}
