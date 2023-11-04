package com.custometCrudOperations.Customer.service;

import com.custometCrudOperations.Customer.dao.customerDAO;
import com.custometCrudOperations.Customer.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    private customerDAO CustomerDAO ;

    @Autowired
    public CustomerServiceImpl(customerDAO tehCustomerDAO){
        CustomerDAO=tehCustomerDAO;
    }

    @Override
    public List<Customer> findAll() {
        return CustomerDAO.findAll();
    }

    @Override
    public Customer findById(int theId) {
        return CustomerDAO.findById(theId);
    }

    @Transactional
    @Override
    public Customer save(Customer theCustomer) {
        return CustomerDAO.save(theCustomer);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
         CustomerDAO.deleteById(theId);

    }
}
