package com.shivtejworld.storemanagementapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivtejworld.storemanagementapp.model.Shipper;
@Repository
public interface ShipperRepository extends JpaRepository<Shipper,Long>{


}
