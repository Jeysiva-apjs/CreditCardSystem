package com.ford.creditcardsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ford.creditcardsystem.entity.Customer;
import com.ford.creditcardsystem.exception.CustomerNotFoundException;
import com.ford.creditcardsystem.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getCustomerById(Long id) {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new CustomerNotFoundException("Customer not found!"));
        return customer;
    }

    @Override
    public String addCustomer(Customer customer) { 
        customerRepository.save(customer);
        return "Customer added successfully!";
    }

    @Override
    public String editCustomer(Long id, Customer customer) {

        this.throwExceptionIfCustomerNotFound(id);  
        Customer updatedCustomer =  new Customer(customer);
        customerRepository.save(updatedCustomer);
        return "Customer updated successfully!";
        
    }

    @Override
    public String deleteCustomer(Long id) {

        this.throwExceptionIfCustomerNotFound(id);
        customerRepository.deleteById(id); 
        return "Customer deleted successfully!";  
    }

    @Override
    public List<Customer> viewAllCustomers() {
        return customerRepository.findAll();
    }  

    public void throwExceptionIfCustomerNotFound(Long id) {
        customerRepository.findById(id).orElseThrow(() -> new CustomerNotFoundException("Customer not found!"));
    }
}
