package com.example.SpringBoot.InsuranceManagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot.InsuranceManagement.model.InsurancePolicy;
import com.example.SpringBoot.InsuranceManagement.repository.InsurancePolicyRepository;
import com.example.SpringBoot.InsuranceManagement.service.InsurancePolicyService;
@Service
public class InsurancePolicyServiceImpl implements InsurancePolicyService {
    @Autowired
	private InsurancePolicyRepository policyRepository;
	  
  	public InsurancePolicyServiceImpl(InsurancePolicyRepository policyRepository) {
		super();
		this.policyRepository = policyRepository;
	}


	@Override
	public InsurancePolicy createPolicy(InsurancePolicy policy) {
    		
		return policyRepository.save(policy);
	}


	@Override
	public InsurancePolicy getPolicy(int id) {
		InsurancePolicy insurancePolicy=policyRepository.findById(id).orElse(new InsurancePolicy());
		return insurancePolicy;
	}


	@Override
	public InsurancePolicy deletePolicy(int id) {
		InsurancePolicy insurancePolicy=policyRepository.findById(id).orElse(new InsurancePolicy());
		policyRepository.deleteById(id);
		return insurancePolicy;
	}


	@Override
	public InsurancePolicy updatePolicy(int id) {
		InsurancePolicy insurancePolicy=policyRepository.findById(id).orElse(new InsurancePolicy());
		policyRepository.deleteById(id);
		return insurancePolicy;
	}

	

	
	
	
}
