package com.example.REST.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class user_manager {
	
	@Id
	@GeneratedValue
	
	@Column(name="EmployeeID")
	private int EmployeeID;
	
	@Column(name="FirstName")
	private String FirstName;
	
	@Column(name="LastName")
	private String LastName;
	
	public user_manager() {
		
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int EmployeeID) {
		this.EmployeeID = EmployeeID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
}
