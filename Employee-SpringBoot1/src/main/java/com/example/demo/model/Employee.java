package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String firstName;
	private String lastName;
	private String number;
	private String adresss;
	private String department;
	
	public Employee() {}
	
	public Employee(Long userId, String firstName, String lastName, String number, String adresss, String department) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.adresss = adresss;
		this.department = department;
	}



	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAdresss() {
		return adresss;
	}

	public void setAdresss(String adresss) {
		this.adresss = adresss;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", number="
				+ number + ", adresss=" + adresss + ", department=" + department + "]";
	}
	
}
