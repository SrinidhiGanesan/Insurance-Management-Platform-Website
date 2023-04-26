package com.example.SpringBoot.InsuranceManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot.InsuranceManagement.model.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Integer> {

}
