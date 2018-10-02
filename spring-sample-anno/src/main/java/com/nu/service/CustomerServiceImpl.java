package com.nu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu.model.Customer;
import com.nu.repo.CustomerRepo;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
//	@Autowired
	private CustomerRepo customerRepositor;

	@Autowired
	public CustomerServiceImpl(CustomerRepo customerRepositor) {
		super();
		this.customerRepositor = customerRepositor;
	}

//	@Autowired
	public void setCustomerRepositor(CustomerRepo customerRepositor) {
		System.out.println("We are setter injection");
		this.customerRepositor = customerRepositor;
	}

	public List<Customer> findAll() {
		return customerRepositor.findAll();
	}

}
