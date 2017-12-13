package com.monirthought.ntw.controller;

import org.springframework.web.bind.annotation.RestController;

import com.monirthought.ntw.service.NumberToWordConversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Index controller
 * 
 * @author Moniruzzaman Md
 *
 */
@RestController
public class IndexController {

	@Autowired
	NumberToWordConversion conversion;

	@RequestMapping("convert/{number}")
	public String index(@PathVariable(value = "number") Long number) {
		return conversion.convertIntoWords(number);
	}

}
