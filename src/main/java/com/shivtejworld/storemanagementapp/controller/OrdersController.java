
package com.shivtejworld.storemanagementapp.controller;

import java.util.Date;
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

import com.shivtejworld.storemanagementapp.model.Orders;
import com.shivtejworld.storemanagementapp.service.OrdersService;

@RestController
@RequestMapping("/orders")
public class OrdersController {

	@Autowired(required = true)
	private OrdersService ordersService;

	@CrossOrigin
	@GetMapping
	public List<Orders> getAllOrders() {
		return ordersService.getAllOrders();
	}

	@CrossOrigin
	@DeleteMapping
	public String deleteOrderById(@RequestParam Long orderID) {
		return ordersService.deleteOrderById(orderID);
	}

	@CrossOrigin
	@PostMapping
	public Orders saveOrder(@RequestBody Orders order) {
		System.out.println(order);
		return ordersService.saveOrder(order);
	}

	@CrossOrigin
	@PatchMapping
	public String updateOrders(
			@RequestParam Long orderID,
			@RequestParam Long customerID,
			@RequestParam Long employeeID,
			@RequestParam Date orderDate,
			@RequestParam Long shipperID) {
		return ordersService.updateOrder(orderID, customerID, employeeID, orderDate, shipperID);
	}

}
