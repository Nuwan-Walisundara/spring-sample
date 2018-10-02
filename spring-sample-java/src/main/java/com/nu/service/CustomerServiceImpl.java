package com.nu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.nu.model.Customer;
import com.nu.repo.CustomerRepo;
import com.nu.repo.HibernateCustomerRepoImpl;
@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CustomerServiceImpl implements CustomerService {
	public CustomerServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	private CustomerRepo customerRepo;
	@Autowired
	public void setCustomerRepo(CustomerRepo customerRepo) {
		System.out.println("Hey we are using setter Injection");
		this.customerRepo = customerRepo;
	}

	public List<Customer> findAll() {
		return customerRepo.findAll();
	}

	public CustomerServiceImpl(CustomerRepo customerRepo) {
		super();
		System.out.println("Hey we are using Constructor Injection");
		this.customerRepo = customerRepo;
	}

}
