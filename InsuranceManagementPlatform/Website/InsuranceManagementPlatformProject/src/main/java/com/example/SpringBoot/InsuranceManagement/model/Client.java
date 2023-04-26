package com.example.SpringBoot.InsuranceManagement.model;

import org.springframework.format.annotation.DateTimeFormat;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Client {
	@Id
	private int id;
	@Column
	private String name;
	@Column
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String dateOfBirth;
	@Column
	private String address;
	@Column
	private String contactInformation;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(int id, String name, String dateOfBirth, String address, String contactInformation) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.contactInformation = contactInformation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactInformation() {
		return contactInformation;
	}
	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ ", contactInformation=" + contactInformation + "]";
	}
	
	
	
	
	

}
