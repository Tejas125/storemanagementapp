package com.shivtejworld.storemanagementapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shivtejworld.storemanagementapp.model.Shipper;
import com.shivtejworld.storemanagementapp.repository.ShipperRepository;
import com.shivtejworld.storemanagementapp.service.ShipperService;

@RestController
@RequestMapping("/shippers")
public class ShipperController {

	@Autowired
	private ShipperService shipperService;
	
	
	@CrossOrigin
	@GetMapping
	public List<Shipper> getAllShippers() {
		return shipperService.getAllShippers();
	}

	@CrossOrigin
	@DeleteMapping
	public String deleteShipperById(@RequestParam Long shipperID) {
		return shipperService.deleteShipperById(shipperID);
	}

	@CrossOrigin
	@PostMapping
	public Shipper saveShipper(@RequestBody Shipper shipper) {
		System.out.println(shipper.toString());
		return shipperService.saveShipper(shipper);
	}
	
	@CrossOrigin
	@PatchMapping
	public String updateShipper(@RequestParam Long shipperID, @RequestParam String shipperName, @RequestParam Long phone) {
		return shipperService.updateShipper(shipperID, shipperName,phone);
	}
	
}
