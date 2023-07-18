package com.shivtejworld.storemanagementapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="orders")
public class Orders {
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderID")
	private Long OrderID;
	

    @Column(name = "CustomerID")
	private Long CustomerID;

    @Column(name="EmployeeID")
	private Long EmployeeID;
	

    @Column(name="Order_Date")
	private Date OrderDate;	
	

    @Column(name = "ShipperID")
	private Long ShipperID;
	
	public Long getOrderID() {
		return OrderID;
	}



	public void setOrderID(Long orderID) {
		OrderID = orderID;
	}



	public Long getCustomerID() {
		return CustomerID;
	}



	public void setCustomerID(Long customerID) {
		CustomerID = customerID;
	}



	public Long getEmployeeID() {
		return EmployeeID;
	}



	public void setEmployeeID(Long employeeID) {
		EmployeeID = employeeID;
	}



	public Date getOrderDate() {
		return OrderDate;
	}



	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}



	public Long getShipperID() {
		return ShipperID;
	}



	public void setShipperID(Long shipperID) {
		ShipperID = shipperID;
	}



	@Override
	public String toString() {
		return "{"+this.OrderID+","+this.CustomerID+","+this.EmployeeID+","+this.OrderDate+","+this.ShipperID+"}";
	}
	
}
