package com.ford.creditcardsystem.service;

import java.util.List;

import com.ford.creditcardsystem.entity.Customer;

public interface CustomerService {

    String addCustomer(Customer customer);
    String editCustomer(Long id, Customer customer);
    String deleteCustomer(Long id);
    Customer getCustomerById(Long id);
    List<Customer> viewAllCustomers();
 
}
