package com.example.SpringBoot.InsuranceManagement.service;

import com.example.SpringBoot.InsuranceManagement.model.Claim;

public interface ClaimService {
	
	Claim createClaim(Claim claim);
    Claim getById(int id);
    Claim deleteByid(int id);
    Claim update(int id);
    
}
