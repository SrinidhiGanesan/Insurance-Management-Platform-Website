package com.example.SpringBoot.InsuranceManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot.InsuranceManagement.model.InsurancePolicy;

public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Integer> {

}
