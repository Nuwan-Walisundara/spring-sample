package com.nu.service;

import java.util.List;

import com.nu.model.Customer;
import com.nu.repo.CustomerRepo;
import com.nu.repo.HibernateCustomerRepoImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepo customerRepo = new HibernateCustomerRepoImpl();

	public List<Customer> findAll() {
		return customerRepo.findAll();
	}

}
