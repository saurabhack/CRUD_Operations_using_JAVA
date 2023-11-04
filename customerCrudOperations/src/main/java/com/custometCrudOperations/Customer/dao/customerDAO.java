package com.custometCrudOperations.Customer.dao;

import com.custometCrudOperations.Customer.entity.Customer;

import java.util.List;

public interface customerDAO {

    List<Customer> findAll();

     Customer findById(int theId);

     Customer save(Customer theCustomer);

     void deleteById(int theId);


}
