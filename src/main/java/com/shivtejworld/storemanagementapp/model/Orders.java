package com.shivtejworld.storemanagementapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderID")
	private Long OrderID;
	@Column(name = "CustomerID")
	private Long CustomerID;
	@Column(name="EmployeeID")
	private Long EmployeeID;
	@Column(name="OrderDate")
	private Date OrderDate;	
	@Column(name = "ShipperID")
	private Long ShipperID;
	
	public Long getOrderID() {
		return OrderID;
	}
	public void setOrderID(Long OrderID) {
		this.OrderID = OrderID;
	}
	public Long getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(Long CustomerID) {
		this.CustomerID= CustomerID;
	}
	
	public Long getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(Long EmployeeID) {
		this.EmployeeID = EmployeeID;
	}
	
	public Date getOrderDate() {
		return OrderDate;
	}
	
	public void setOrderDate(Date OrderDate) {
		this.OrderDate=OrderDate;
	}
	
	public Long getShipperID() {
		return ShipperID;
	}
	public void setShipperID(Long ShipperID) {
		this.ShipperID= ShipperID;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{"+this.OrderID+","+this.CustomerID+","+this.EmployeeID+","+this.OrderDate+","+this.ShipperID+"}";
	}
	
}
