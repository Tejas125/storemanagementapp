package com.shivtejworld.storemanagementapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivtejworld.storemanagementapp.model.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers,Long>{
	
	
}
