package com.dev.apps.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

	@GetMapping("/")
	public String home(@RequestParam(defaultValue="DefeultName") String name,ModelMap ModelMap) {
		
		System.out.println(name);		
		ModelMap.put("name", name);		
		return "pages/home";
	}
}
