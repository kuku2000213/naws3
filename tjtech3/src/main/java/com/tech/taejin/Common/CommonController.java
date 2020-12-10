package com.tech.taejin.Common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

	@RequestMapping("/")
	public String home() {
		
		return "common/home";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		
		return "common/hello";
	}
}
