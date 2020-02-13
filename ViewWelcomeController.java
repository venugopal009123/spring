package com.fwmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ViewWelcomeController implements yourController{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv=null;
		mv=new ModelAndView();
		mv.setViewName("welcome");
	System.out.println("mycontroller");
		return mv;
		
	}
	

}
