package org.zerock.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class test {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test1(Locale locale, Model model) {
		log.info("a/test");
		return "test";
	}
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test2(Locale locale, Model model) {
		log.info("a/test2");
		return "test2";
	}
	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public String test3(Locale locale, Model model) {
		log.info("a/test3");
		return "test3";
	}
}
