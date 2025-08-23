
package com.shivtejworld.storemanagementapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shivtejworld.storemanagementapp.model.Customers;
import com.shivtejworld.storemanagementapp.service.CustomersService;

@RestController
@RequestMapping("/customers")
public class CustomersController {

	@Autowired(required = true)
	private CustomersService customersService;

	@CrossOrigin
	@GetMapping
	public List<Customers> getAllCustomers() {
		return customersService.getAllCustomers();
	}

	@CrossOrigin
	@DeleteMapping
	public String deleteCustomerById(@RequestParam Long customerID) {
		return customersService.deleteCustomersById(customerID);
	}

	@CrossOrigin
	@PostMapping
	public Customers saveCustomer(@RequestBody Customers cust) {
		System.out.println(cust);
		return customersService.saveCustomer(cust);
	}

	/*
	@CrossOrigin
	@PatchMapping
	public String updateCustomer(
			@RequestParam Long customerID,
			@RequestParam String customerName,
			@RequestParam String contactName,
			@RequestParam String address,
			@RequestParam String city,
			@RequestParam long postalCode,
			@RequestParam String country) {
		return customersService.updateCustomer(customerID, customerName, contactName, address, city, postalCode, country);
	}
	*/
}
