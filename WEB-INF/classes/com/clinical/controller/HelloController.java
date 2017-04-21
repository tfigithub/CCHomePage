package com.clinical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello(){
		String message="Hello San Apps, how r u";
		return new ModelAndView("hellopage","message",message);
	}
}
