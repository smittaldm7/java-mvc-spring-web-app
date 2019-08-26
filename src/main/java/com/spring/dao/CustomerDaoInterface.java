package com.spring.dao;

import com.spring.model.Customer;

public interface CustomerDaoInterface {
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}
