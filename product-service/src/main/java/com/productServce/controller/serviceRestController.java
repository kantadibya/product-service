package com.productServce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.productServce.entity.productEntity;
import com.productServce.serviceImpl.productServiceImpl;


@Controller
@ResponseBody
@RestController
public class serviceRestController {
	
	@Autowired
	private productServiceImpl productServiceImpl;
	@RequestMapping(value="/getAllUser",method=RequestMethod.GET)
	@GetMapping(value="/getAllUser")
	public @ResponseBody List<productEntity> getAllUser(productEntity resgisterEntity)
	{
	      return productServiceImpl.getAllUser();
	}
	
	@RequestMapping(value="/saveUserDetails",method=RequestMethod.POST)
	@PostMapping(value="/saveRegisterDetails")
	public void saveUserDetails( @RequestBody productEntity registerEntity) {
		productServiceImpl.processUserInfo(registerEntity);
		
	}

}
