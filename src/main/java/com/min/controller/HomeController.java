package com.min.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/loginPage")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping("/admin")
	public ModelAndView admin() {
		ModelAndView mv = new ModelAndView("adminPage");
		return mv;
	}
	
	@RequestMapping("/accessDenied")
	public ModelAndView accessDenied() {
		ModelAndView mv = new ModelAndView("403");
		return mv;
	}
}
