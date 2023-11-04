package com.custometCrudOperations.Customer.rest;

import com.custometCrudOperations.Customer.entity.Customer;
import com.custometCrudOperations.Customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class customerRestControler {

    private CustomerService customerService;

    @Autowired
    public customerRestControler(CustomerService theCustomerService){
        customerService=theCustomerService;
    }

    @GetMapping("/customers")
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    @GetMapping("/customers/{customerId}")
    public Customer getCustomer(@PathVariable int customerId){
        Customer theCustomer = customerService.findById(customerId);
        if(theCustomer==null){
            throw new RuntimeException("Customer does not exists");
        }
        return theCustomer;
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer theCustomer){
        theCustomer.setId(0);
        Customer dbCustomer=customerService.save(theCustomer);
        return dbCustomer;
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer theCustomer){
        Customer dbCustomer=customerService.save(theCustomer);
        return dbCustomer;
    }

    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable int customerId){
        Customer tempCustomer = customerService.findById(customerId);
        if(tempCustomer==null){
            throw new RuntimeException("customer does not exist int these database"+customerId);
        }

        customerService.deleteById(customerId);

        return "Deleted customer id - "+customerId;
    }

}
