package com.utez.sda.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
	Logger logger = LoggerFactory.getLogger(LoggingController.class);
	
	@RequestMapping("/index")
	public String index() {
		System.out.println("Logging por defecto Logback <- Log4j2");
		logger.trace("Trace message");
		logger.debug("Debung message");
		logger.info("Info message");
		logger.warn("Warn message");
		logger.error("Error message");
		
		return"Hola desde LoggingController";
	}


}
