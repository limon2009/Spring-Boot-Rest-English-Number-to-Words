package com.monirthought.ntw.service;

/**
 * NumberToWordConversion
 * 
 * @author Moniruzzaman
 *
 */
public interface NumberToWordConversion {
	/**
	 * Convert English number into Words
	 * 
	 * @param number
	 * @return number in words as string
	 */
	public String convertIntoWords(Long number);
}
