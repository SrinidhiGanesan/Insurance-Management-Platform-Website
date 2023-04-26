package com.example.SpringBoot.InsuranceManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot.InsuranceManagement.model.Client;


public interface ClientRepository extends JpaRepository<Client, Integer> {

}
