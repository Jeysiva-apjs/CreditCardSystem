package com.ford.creditcardsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ford.creditcardsystem.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
