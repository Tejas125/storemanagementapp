package com.shivtejworld.storemanagementapp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivtejworld.storemanagementapp.model.Customers;
import com.shivtejworld.storemanagementapp.repository.CustomersRepository;

@Service
public class CustomersService {

	@Autowired
	private CustomersRepository customersRepository;

	public List<Customers> getAllCustomers() {
		List<Customers> customersList = new ArrayList<Customers>();

		Iterable<Customers> iterator = customersRepository.findAll();
		iterator.forEach(customer -> customersList.add(customer));

		customersList.sort((Customers c1, Customers c2) -> c2.getCustomerID().compareTo(c1.getCustomerID()));
		return customersList;

		
	}

	public String deleteCustomersById(Long CustomerID) {
		
		Optional<Customers> customer = customersRepository.findById(CustomerID);

		if (customer.isPresent()) {

			customersRepository.deleteById(customer.get().getCustomerID());

			return "Customer with CustomerID " + CustomerID + "Deleted";
		} else {
			return "Customer with CustomerID" + CustomerID + " Not Available";
		}

	}
	/*
	 * public Orders saveOrder(Orders order) { System.out.println(order); return
	 * customersRepository.save(order); }
	 * 
	 * 
	 * public String updateOrder(Long orderID, Long customerID, Long employeeID,
	 * Date orderDate, Long shipperID) {
	 * 
	 * Optional<Orders> order = customersRepository.findById(orderID); if
	 * (order.isPresent()) { order.get().setCustomerID(customerID);
	 * order.get().setEmployeeID(employeeID); order.get().setOrderDate(orderDate);
	 * order.get().setShipperID(shipperID); customersRepository.save(order.get());
	 * return "Shipper with ShipperID " + orderID + "Updated"; } else { return
	 * "Shipper with ShipperID " + orderID + " Not Available"; }
	 * 
	 * }
	 */

	public Customers saveCustomer(Customers cust) {
		return customersRepository.save(cust);
	}

}
