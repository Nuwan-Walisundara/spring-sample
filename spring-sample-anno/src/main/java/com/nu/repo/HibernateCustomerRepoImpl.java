package com.nu.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.nu.model.Customer;
@Repository("customerRepository")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HibernateCustomerRepoImpl implements CustomerRepo {
	@Value("${dbUserName}" )
	private String dbUserName;
	/* (non-Javadoc)
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
