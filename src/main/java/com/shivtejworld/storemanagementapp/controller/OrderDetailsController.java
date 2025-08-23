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
import com.shivtejworld.storemanagementapp.model.OrderDetails;
import com.shivtejworld.storemanagementapp.service.OrderDetailsService;

@RestController
@RequestMapping("/orderdetails")
public class OrderDetailsController {

	@Autowired(required = true)
	private OrderDetailsService orderDetailsService;

	@CrossOrigin
	@GetMapping
	public List<OrderDetails> getAllOrderDetails() {
		return orderDetailsService.getAllOrderDetails();
	}

	@CrossOrigin
	@DeleteMapping
	public String deleteOrderById(@RequestParam Long orderDetailID) {
		return orderDetailsService.deleteOrderDetailById(orderDetailID);
	}

	@CrossOrigin
	@PostMapping
	public OrderDetails saveOrderDetail(@RequestBody OrderDetails orderDetail) {
		System.out.println(orderDetail);
		return orderDetailsService.saveOrderDetail(orderDetail);
	}

	@CrossOrigin
	@PatchMapping
	public String updateOrderDetails(
			@RequestParam Long orderID,
			@RequestParam Long customerID,
			@RequestParam Long employeeID,
			@RequestParam Date orderDate,
			@RequestParam Long shipperID) {
		return orderDetailsService.updateOrderDetail(orderID, customerID, employeeID, orderDate, shipperID);
	}

}
