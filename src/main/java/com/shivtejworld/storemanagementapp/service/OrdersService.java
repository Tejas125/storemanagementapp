package com.shivtejworld.storemanagementapp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivtejworld.storemanagementapp.model.Orders;
import com.shivtejworld.storemanagementapp.model.Shipper;
import com.shivtejworld.storemanagementapp.repository.OrdersRepository;

@Service
public class OrdersService {
	
	@Autowired
	private	OrdersRepository ordersRepository;
	
	public List<Orders> getAllOrders() {
		List<Orders> ordersList = new ArrayList<Orders>();

		Iterable<Orders> iterator = ordersRepository.findAll();
		iterator.forEach(order -> ordersList.add(order));

		ordersList.sort((Orders o1, Orders o2) -> o2.getOrderID().compareTo(o1.getOrderID()));
		return ordersList;

	}

	public String deleteOrderById(Long orderID) {
		Optional<Orders> orders = ordersRepository.findById(orderID);
		
		if (orders.isPresent()) {
			
			ordersRepository.deleteById(orders.get().getOrderID());
			
			return "Shipper with ShipperID " + orderID + "Deleted";
		} else {
			return "Shipper with ShipperID " + orderID + " Not Available";
		}

	}

	public Orders saveOrder(Orders order) {
		System.out.println(order);
		return ordersRepository.save(order);
	}

	
	public String updateOrder(Long orderID, Long customerID, Long employeeID, Date orderDate, Long shipperID) {

		Optional<Orders> order = ordersRepository.findById(orderID);
		if (order.isPresent()) {
			order.get().setCustomerID(customerID);
			order.get().setEmployeeID(employeeID);
			order.get().setOrderDate(orderDate);
			order.get().setShipperID(shipperID);
			ordersRepository.save(order.get());
			return "Shipper with ShipperID " + orderID + "Updated";
		} else {
			return "Shipper with ShipperID " + orderID + " Not Available";
		}

	}

}
