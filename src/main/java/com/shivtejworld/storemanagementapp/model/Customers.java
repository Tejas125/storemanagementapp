package com.shivtejworld.storemanagementapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {
	
	/*
	 * ParticularId int,
ParticularName varchar,
ParticularType varchar,
createdBy varchar,
createdOn date,
modifiedBy varchar,
modifiedOn date
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shipperid")
	private Long shipperID;
	@Column(name = "shippername")
	private String shipperName;
	@Column(name = "phone")
	private Long phone;
	
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
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{"+this.shipperID+","+this.shipperName+","+this.phone+"}";
	}
	
}
