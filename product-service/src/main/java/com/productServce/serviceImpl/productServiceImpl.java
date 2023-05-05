package com.productServce.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productServce.Repository.serviceRepository;
import com.productServce.entity.productEntity;
import com.productServce.service.productService;
@Service
public class productServiceImpl implements productService
{
	
	@Autowired
    private serviceRepository serviceRepository;

	@Override
	public void processUserInfo(productEntity ProductEntity) {
      serviceRepository.saveUser(ProductEntity);
		
	}

	@Override
	public List<productEntity> getAllUser() {
		// TODO Auto-generated method stub
		return serviceRepository.findAllUser();
	}
	
	
}
