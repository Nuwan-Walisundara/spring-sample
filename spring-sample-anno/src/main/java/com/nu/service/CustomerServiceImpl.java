package com.nu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.nu.model.Customer;
import com.nu.repo.CustomerRepo;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CustomerServiceImpl implements CustomerService {
//	@Autowired
	private CustomerRepo customerRepositor;

//	@Autowired
	public CustomerServiceImpl(CustomerRepo customerRepositor) {
		super();
		System.out.println(customerRepositor);
		this.customerRepositor = customerRepositor;
	}

	@Autowired
	public void setCustomerRepositor(CustomerRepo customerRepositor) {
		System.out.println("We are setter injection");
		this.customerRepositor = customerRepositor;
	}
	@Autowired
	public List<Customer> findAll() {
		return customerRepositor.findAll();
	}

}
