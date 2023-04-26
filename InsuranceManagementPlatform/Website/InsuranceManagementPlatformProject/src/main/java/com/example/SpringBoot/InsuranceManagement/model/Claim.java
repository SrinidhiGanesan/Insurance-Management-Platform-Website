package com.example.SpringBoot.InsuranceManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Claim {
	@Id
	private int id;
	@Column
	private String description;
	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Claim(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", description=" + description + "]";
	}
	

}
