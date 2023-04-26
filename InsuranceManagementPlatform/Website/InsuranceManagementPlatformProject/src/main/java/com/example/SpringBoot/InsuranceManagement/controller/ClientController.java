package com.example.SpringBoot.InsuranceManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringBoot.InsuranceManagement.model.Client;
import com.example.SpringBoot.InsuranceManagement.repository.ClientRepository;
import com.example.SpringBoot.InsuranceManagement.service.ClientService;

@Controller
public class ClientController {
	@Autowired
	private ClientService clientService;
	
	//http://localhost:8080/welcome
	
	@RequestMapping("welcome")
	public String welcome() {
		return "welcome.jsp";
		
	}
	
	
	@RequestMapping("index")
	public String index() {
		return  "index.jsp";
	}
	
	@RequestMapping("create")
	public String createClient(Client client) {
		clientService.createClient(client);
		return "index";
			
	}
	
	
	@RequestMapping("getValue")
	public ModelAndView getById(@RequestParam int id){
		ModelAndView mav=new ModelAndView("show.jsp");
		Client client=clientService.getById(id);
		mav.addObject(client);
		return mav;
				
	}
	
	@RequestMapping("deleteValue")
	public ModelAndView deleteById(@RequestParam int id){
		ModelAndView mav=new ModelAndView("delete.jsp");
		Client client=clientService.getById(id);
		clientService.deleteById(id);
		mav.addObject(client);
		return mav;
			
	}
	
	@RequestMapping("updateValue")
	public ModelAndView updateById(@RequestParam int id){
		ModelAndView mav=new ModelAndView("update.jsp");
		Client client=clientService.updateById(id);
		mav.addObject(client);
		return mav;
			
	}
	
	
	
	
	
	
	

}
