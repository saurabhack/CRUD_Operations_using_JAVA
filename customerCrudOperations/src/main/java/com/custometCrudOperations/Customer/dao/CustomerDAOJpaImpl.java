package com.custometCrudOperations.Customer.dao;

import com.custometCrudOperations.Customer.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOJpaImpl implements customerDAO {
    private EntityManager entityManager;

    @Autowired
    public CustomerDAOJpaImpl(EntityManager theEntityManager){
        entityManager=theEntityManager;
    }
    @Override
    public List<Customer> findAll(){
        TypedQuery<Customer> theQuery=entityManager.createQuery("from Customer",Customer.class);

        List<Customer> customers=theQuery.getResultList();

        return customers;
    }

    @Override
    public Customer findById(int theId){
        Customer theCustomer=entityManager.find(Customer.class,theId);
        return theCustomer;
    }

    @Override
    public Customer save(Customer theCustomer){
        Customer dbCustomer= entityManager.merge(theCustomer);
        return dbCustomer;
    }

    @Override
    public void deleteById(int theId){
        Customer theCustomer=entityManager.find(Customer.class,theId);
        entityManager.remove(theCustomer);
    }

}
