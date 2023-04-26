package com.example.SpringBoot.InsuranceManagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot.InsuranceManagement.model.Client;
import com.example.SpringBoot.InsuranceManagement.repository.ClientRepository;
import com.example.SpringBoot.InsuranceManagement.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public ClientServiceImpl(ClientRepository clientRepository) {
		super();
		this.clientRepository = clientRepository;
	}

	@Override
	public Client createClient(Client client) {
		
		return clientRepository.save(client);
	}



	@Override
	public Client getById(int id) {
		 Client client=clientRepository.findById(id).orElse(new Client());
		 return client;
	}

	@Override
	public Client deleteById(int id) {
		Client client=clientRepository.findById(id).orElse(new Client());
		clientRepository.deleteById(id);
		return client;
	}

	@Override
	public Client updateById(int id) {
		Client client=clientRepository.findById(id).orElse(new Client());
		clientRepository.deleteById(id);
		return client;
	}

	

	

	

	
	
	
	
	
}
