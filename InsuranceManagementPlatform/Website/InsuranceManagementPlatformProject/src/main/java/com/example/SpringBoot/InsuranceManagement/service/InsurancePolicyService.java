package com.example.SpringBoot.InsuranceManagement.service;

import com.example.SpringBoot.InsuranceManagement.model.InsurancePolicy;

public interface InsurancePolicyService  {
	
	InsurancePolicy createPolicy(InsurancePolicy policy);
	InsurancePolicy getPolicy(int id);
	InsurancePolicy deletePolicy(int id);
	InsurancePolicy updatePolicy(int id);

}
