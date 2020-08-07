package com.cg.movie.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.movie.dao.CustomerRepository;
import com.cg.movie.entities.Customer;

public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	CustomerRepository customerRepo;
	
	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

}
