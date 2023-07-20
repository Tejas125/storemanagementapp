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
	
	private static final long serialVersionUID = 1L;
	
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{"+"}";
	}
	
}
