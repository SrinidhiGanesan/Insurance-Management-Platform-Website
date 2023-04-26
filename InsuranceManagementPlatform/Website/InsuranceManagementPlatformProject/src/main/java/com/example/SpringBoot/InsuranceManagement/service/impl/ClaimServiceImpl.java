package com.example.SpringBoot.InsuranceManagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot.InsuranceManagement.model.Claim;
import com.example.SpringBoot.InsuranceManagement.repository.ClaimRepository;
import com.example.SpringBoot.InsuranceManagement.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService {
	
	@Autowired
	private ClaimRepository claimRepository;

	public ClaimServiceImpl(ClaimRepository claimRepository) {
		super();
		this.claimRepository = claimRepository;
	}

	@Override
	public Claim createClaim(Claim claim) {
		return claimRepository.save(claim);
	}

	@Override
	public Claim getById(int id) {
		Claim claim=claimRepository.findById(id).orElse(new Claim());
		return claim;
	}

	@Override
	public Claim deleteByid(int id) {
		Claim claim=claimRepository.findById(id).orElse(new Claim());
		claimRepository.deleteById(id);
		return claim;
		
	}

	@Override
	public Claim update(int id) {
		Claim claim=claimRepository.findById(id).orElse(new Claim());
		claimRepository.deleteById(id);
		return claim;
		
	}


}
