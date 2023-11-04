package com.custometCrudOperations.Customer.service;

import com.custometCrudOperations.Customer.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    Customer findById(int theId);

    Customer save(Customer theCustomer);

    void deleteById(int theId);
}
