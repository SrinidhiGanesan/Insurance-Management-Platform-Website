package com.example.SpringBoot.InsuranceManagement.model;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class InsurancePolicy {
	@Id
	private int id;
	@Column
	private String policyNumber;
	@Column
	private String type;
	@Column
	private int coverageAmount;
	@Column
	private int premium;
	@Column
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private String startDate;
	@Column
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private String endDate;
	public InsurancePolicy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InsurancePolicy(int id, String policyNumber, String type, int coverageAmount, int premium, String startDate,
			String endDate) {
		super();
		this.id = id;
		this.policyNumber = policyNumber;
		this.type = type;
		this.coverageAmount = coverageAmount;
		this.premium = premium;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCoverageAmount() {
		return coverageAmount;
	}
	public void setCoverageAmount(int coverageAmount) {
		this.coverageAmount = coverageAmount;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", policyNumber=" + policyNumber + ", type=" + type + ", coverageAmount="
				+ coverageAmount + ", premium=" + premium + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	


}
