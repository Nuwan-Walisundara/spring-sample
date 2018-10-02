package com.nu.service;

import java.util.List;

import com.nu.model.Customer;
import com.nu.repo.CustomerRepo;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepo customerRepo;

	
	public CustomerServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerServiceImpl(CustomerRepo customerRepo) {
		super();
		this.customerRepo = customerRepo;
	}

	public void setCustomerRepo(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}

	public List<Customer> findAll() {
		return customerRepo.findAll();
	}

}
