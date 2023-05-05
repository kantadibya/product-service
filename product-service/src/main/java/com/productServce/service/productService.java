package com.productServce.service;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.productServce.entity.productEntity;


@Controller
public interface productService {
	
	public void processUserInfo(productEntity ProductEntity) ;
	public List<productEntity> getAllUser();

}
