package com.dion.utils;

import java.math.BigDecimal;

/**
 * Object Getter
 * 
 * <pre>
 * bd: BigDecimal
 * </pre>
 * 
 * @author TaiL
 * @since 2013-4-7
 */
public abstract class GO {

	private GO() {
	}

	public static BigDecimal bd(Object source) {
		return bd(source, BigDecimal.ZERO);
	}

	public static BigDecimal bdDown(BigDecimal source) {
		return bd(source.setScale(2,BigDecimal.ROUND_DOWN), BigDecimal.ZERO);
	}
	
	/**
	 * 获取 BigDecimal
	 * 
	 * @param source
	 * @param defaultValue
	 * @return
	 */
	public static BigDecimal bd(Object source, BigDecimal defaultValue) {
		if (source != null) {
			if (source instanceof BigDecimal) {
				return (BigDecimal) source;
			}
			if (source instanceof Number) {
				return BigDecimal.valueOf(((Number) source).doubleValue());
			}
			try {
				return new BigDecimal(source.toString());
      } catch (final Exception e) {
      }
		}
		return defaultValue;
	}

	/**
	 * @param source
	 * @return null if source is null
	 */
	public static String string(Object source) {
		return string(source, null);
	}
	
	public static String stringScale2Down(BigDecimal source) {
		return string(bd(source.setScale(2,BigDecimal.ROUND_DOWN), BigDecimal.ZERO), null);
	}

	/**
	 * @param source
	 * @param defaultValue
	 * @return defaultValue if source is null
	 */
	public static String string(Object source, String defaultValue) {
		if (source != null) {
			if (source instanceof String) {
				return (String) source;
			}

			return source.toString();
		}
		return defaultValue;
	}

}
