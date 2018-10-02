package com.nu.repo;

import java.util.List;

import com.nu.model.Customer;

public interface CustomerRepo {

	List<Customer> findAll();

}