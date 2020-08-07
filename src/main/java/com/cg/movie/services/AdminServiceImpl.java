package com.cg.movie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.dao.CustomerRepository;

@Service
public class AdminServiceImpl implements IAdminService{

	@Autowired
	CustomerRepository customerRepo;
	
	@Override
	public boolean checkLogin(String adminEmail, String adminPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Long countOfCustomers() {
		return new Long(customerRepo.findAll().size());
	}

}
