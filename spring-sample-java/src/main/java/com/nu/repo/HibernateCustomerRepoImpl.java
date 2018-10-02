package com.nu.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nu.model.Customer;
@Repository
public class HibernateCustomerRepoImpl implements CustomerRepo {

	/* (non-Javadoc)
	 * @see com.nu.repo.CustomerRepo#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Brayan");
		customer.setLastName("Hasen");
		customers.add(customer);
		return customers;
	}
}