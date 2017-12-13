package com.monirthought.ntw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monirthought.ntw.util.NumberToWordConverterUtil;

/**
 * Service class
 * 
 * @author Moniruzzaman Md
 *
 */
@Service
public class NumberToWordConversionImpl implements NumberToWordConversion {

	@Autowired
	NumberToWordConverterUtil convertUtil;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.monirthought.ntw.service.NumberToWordConversion#convertIntoWords(java.
	 * lang.Long)
	 */
	@Override
	public String convertIntoWords(Long number) {
		return convertUtil.convertToWords(number);
	}

}
