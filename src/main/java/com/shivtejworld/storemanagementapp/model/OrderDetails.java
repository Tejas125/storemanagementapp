package com.shivtejworld.storemanagementapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
public class OrderDetails {
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderDetailID")
	private Long OrderDetailID;
	

    @Column(name = "OrderID")
	private Long OrderID;

    @Column(name="ProductID")
	private Long ProductID;

    @Column(name = "Quantity")
	private Long Quantity;
	
    
    
	public Long getOrderDetailID() {
		return OrderDetailID;
	}



	public void setOrderDetailID(Long orderDetailID) {
		OrderDetailID = orderDetailID;
	}



	public Long getOrderID() {
		return OrderID;
	}



	public void setOrderID(Long orderID) {
		OrderID = orderID;
	}



	public Long getProductID() {
		return ProductID;
	}



	public void setProductID(Long productID) {
		ProductID = productID;
	}



	public Long getQuantity() {
		return Quantity;
	}

	public void setQuantity(Long quantity) {
		Quantity = quantity;
	}



	@Override
	public String toString() {
		return "{"+this.OrderDetailID+","+this.OrderID+","+this.ProductID+","+this.Quantity+"}";
	}
	
}
