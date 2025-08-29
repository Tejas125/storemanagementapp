package com.shivtejworld.storemanagementapp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivtejworld.storemanagementapp.model.OrderDetails;
import com.shivtejworld.storemanagementapp.repository.OrderDetailsRepository;
@Service
public class OrderDetailsService {
	
	@Autowired
	OrderDetailsRepository orderDetailsRepository;

	public List<OrderDetails> getAllOrderDetails() {
		List<OrderDetails> ordersList = new ArrayList<OrderDetails>();

		Iterable<OrderDetails> iterator = orderDetailsRepository.findAll();
		iterator.forEach(orderdetail -> ordersList.add(orderdetail));
		/*
		 * 
		 * Iterable<OrderDetails> iterator = orderDetailsRepository.findAll();
		 * iterator.forEach(orderdetail -> ordersList.add(order
		 * detail));
		 * 
		 * ordersList.sort((Orders o1, Orders o2) ->
		 * o2.getOrderID().compareTo(o1.getOrderID()));
		 */
		return ordersList;
	}

	public String deleteOrderDetailById(Long orderDetailID) {
		// TODO Auto-generated method stub
		return null;
	}

	public OrderDetails saveOrderDetail(OrderDetails orderDetail) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateOrderDetail(Long orderID, Long customerID, Long employeeID, Date orderDate, Long shipperID) {
		// TODO Auto-generated method stub
		return null;
	}

}
