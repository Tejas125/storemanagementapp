package com.shivtejworld.storemanagementapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivtejworld.storemanagementapp.model.Orders;
@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long>{
	
}
