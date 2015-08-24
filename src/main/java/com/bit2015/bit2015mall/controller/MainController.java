package com.bit2015.bit2015mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class MainController {
	
	@RequestMapping( "/" )
	public String index() {
		return "main/index";
	}
	
	@RequestMapping( "qa" )
	public String qa() {
		return "qa";
	}
	
	@RequestMapping( "faq" )
	public String faq() {
		return "faq";
	}
}
