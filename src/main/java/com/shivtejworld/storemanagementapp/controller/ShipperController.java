package com.shivtejworld.storemanagementapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.shivtejworld.storemanagementapp.model.Shipper;
import com.shivtejworld.storemanagementapp.service.ShipperService;

@RestController
@RequestMapping("/shippers")
public class ShipperController {

	@Autowired
	private ShipperService shipperService;
	
	@GetMapping()
	public List<Shipper> getAllShippers() {
		return shipperService.getAllShippers();
	}

	@DeleteMapping
	public String deleteShipperById(@RequestParam Long shipperID) {
		return shipperService.deleteShipperById(shipperID);
	}

	@PostMapping
	public Shipper saveShipper(@RequestBody Shipper shipper) {
		return shipperService.saveShipper(shipper);
	}

	@PatchMapping("/updateShipperPhone")
	public String updateShipperPhone(@RequestParam Long shipperID, @RequestParam Integer phone) {
		return shipperService.updateShipperPhone(shipperID, phone);
	}
	
	@PatchMapping("/updateShipperName")
	public String updateShipperName(@RequestParam Long shipperID, @RequestParam String shipperName) {
		return shipperService.updateShipperName(shipperID, shipperName);
	}

	
}
