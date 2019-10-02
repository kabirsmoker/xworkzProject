package com.xworkz.assetmanagement.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	
	public LoginController() {
		logger.info("invoked Login Controller");
	}
	
	@GetMapping("/")
	public String getMessage()
	{
		
		return "views/success.jsp";
		
	}
	
}
