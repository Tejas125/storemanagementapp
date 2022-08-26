package com.shivtejworld.storemanagementapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shippers")
public class Shipper {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "shipperid")
	private Long shipperID;
	@Column(name = "shippername")
	private String shipperName;
	@Column(name = "phone")
	private Integer phone;
	
	public Long getShipperID() {
		return shipperID;
	}
	public void setShipperID(Long shipperID) {
		this.shipperID = shipperID;
	}
	public String getShipperName() {
		return shipperName;
	}
	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	
	
}
