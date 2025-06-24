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
@Table(name="customers")
public class Customers {
	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Customer_id")
	private Long CustomerID;
	

    @Column(name = "Customer_name")
	private String CustomerName;

    @Column(name="Contact_name")
	private String ContactName;
	

    @Column(name="Address")
	private String Address;	
	

    @Column(name = "City")
	private String City;
    
    @Column(name = "Postal_code")
	private String PostalCode;
    
    @Column(name = "Country")
    private String Country;
		
    
    
    
	public Long getCustomerID() {
		return CustomerID;
	}




	public void setCustomerID(Long customerID) {
		CustomerID = customerID;
	}




	public String getCustomerName() {
		return CustomerName;
	}




	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}




	public String getContactName() {
		return ContactName;
	}




	public void setContactName(String contactName) {
		ContactName = contactName;
	}




	public String getAddress() {
		return Address;
	}




	public void setAddress(String address) {
		Address = address;
	}




	public String getCity() {
		return City;
	}




	public void setCity(String city) {
		City = city;
	}




	public String getPostalCode() {
		return PostalCode;
	}




	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}




	public String getCountry() {
		return Country;
	}




	public void setCountry(String country) {
		Country = country;
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
