package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

@RequestMapping("/show")
	public String show(ModelMap map)
	{
	map.addAttribute("id",10);
	map.addAttribute("name","pratik");
	return "home";
	}
	
}
	
