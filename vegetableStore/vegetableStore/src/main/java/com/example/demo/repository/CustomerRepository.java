package com.example.demo.repository;


import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	  @Query("SELECT c FROM Customer c WHERE c.customerId = :customerId")
	    Customer findCustomerById(@Param("customerId") Integer customerId);

}
