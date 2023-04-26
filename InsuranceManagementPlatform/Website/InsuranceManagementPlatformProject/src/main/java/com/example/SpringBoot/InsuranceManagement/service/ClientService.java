package com.example.SpringBoot.InsuranceManagement.service;

import com.example.SpringBoot.InsuranceManagement.model.Client;

public interface ClientService {
	
	Client createClient(Client client);
	Client getById(int id);
	Client deleteById(int id);
	Client updateById(int id);

}
