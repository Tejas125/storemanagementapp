package com.shivtejworld.storemanagementapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shivtejworld.storemanagementapp.model.Shipper;
import com.shivtejworld.storemanagementapp.repository.ShipperRepository;

@RestController
@RequestMapping("/shippers")
public class ShipperController {

	@Autowired
	private ShipperRepository shipperRepository;

	@GetMapping()
	public List<Shipper> getShippers() {
		List<Shipper> shippersList = new ArrayList<Shipper>();

		Iterable<Shipper> iterator = shipperRepository.findAll();
		iterator.forEach(shipper -> shippersList.add(shipper));
		
		return shippersList;
	}

	@PutMapping
	public String putShippers() {
		return "PUT Shippers";
	}

	@DeleteMapping
	public String deleteShippers(@RequestParam Long shipperID) {
		shipperRepository.deleteById(shipperID);
		return "Deleted Shipper with ShipperID "+shipperID+" .";
	}

	@PostMapping
	public Shipper postShippers(@RequestBody Shipper shippers) {
		return shipperRepository.save(shippers);
	}

	@PatchMapping
	public String updateShipperPhone(@RequestParam Long shipperID, @RequestParam Integer phone) {
		Optional<Shipper> myShipper = shipperRepository.findById(shipperID);
		if(myShipper.isPresent()) {
			myShipper.get().setPhone(phone);
			shipperRepository.save(myShipper.get());
			return "Phone Updated for Shipper with ShipperID " + shipperID;
		}
		else {
			return "Shipper with ShipperID " + shipperID + " Not Available";
		}
	}
	
}
