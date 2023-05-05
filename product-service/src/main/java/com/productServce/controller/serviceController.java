package com.productServce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.productServce.entity.productEntity;
import com.productServce.serviceImpl.productServiceImpl;

public class serviceController {
	
	@Autowired
	private productServiceImpl productServiceImpl;
	
	@RequestMapping(value="/saveUserDetail")
	
	public ModelAndView saveUserDetail(productEntity productEntity)
	{
		System.out.println(productEntity);
		productServiceImpl.processUserInfo(productEntity);
		return new ModelAndView("index.jsp");
	}
	
	@RequestMapping(value="/getUsers")
	public void getUsers() {
		
		
	}
	
	

}
