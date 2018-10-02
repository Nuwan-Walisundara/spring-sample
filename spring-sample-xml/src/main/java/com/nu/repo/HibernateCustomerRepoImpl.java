package com.nu.repo;

import java.util.ArrayList;
import java.util.List;

import com.nu.model.Customer;

public class HibernateCustomerRepoImpl implements CustomerRepo {
	private String dbUserName;

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nu.repo.CustomerRepo#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		System.out.println(dbUserName);
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Brayan");
		customer.setLastName("Hasen");
		customers.add(customer);
		return customers;
	}
}
