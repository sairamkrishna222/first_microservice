package com.srk.learning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.srk.learning.bean.HomePage;

@RestController
@RequestMapping("/first")
public class FirstRestController {

	@RequestMapping(method = RequestMethod.GET,path ="/homepage")
	public HomePage gethomepage()
	{
		return new  HomePage("My HomePage");
		
	}
}
	