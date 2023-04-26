package com.example.SpringBoot.InsuranceManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringBoot.InsuranceManagement.model.Claim;
import com.example.SpringBoot.InsuranceManagement.repository.ClaimRepository;
import com.example.SpringBoot.InsuranceManagement.service.ClaimService;

import ch.qos.logback.core.model.Model;

@Controller
public class ClaimController {
	@Autowired
	private ClaimRepository claimRepository;
	@Autowired
	private ClaimService claimService;
	

	
	@RequestMapping("index2")
	public String index() {
		return"index2.jsp";
	}
	@RequestMapping("createClaim")
	public String createClaim(Claim claim) {
		claimService.createClaim(claim);
		return "index2";
	}
	
	@RequestMapping("getClaim")
	public ModelAndView getById(@RequestParam int id) {
		ModelAndView mav=new ModelAndView("showClaim.jsp");
		Claim claim=claimService.getById(id);
		mav.addObject(claim);
		return mav;
		
	}
	
	@RequestMapping("deleteClaim")
	public ModelAndView deleteById(@RequestParam int id) {
		ModelAndView mav=new ModelAndView("deleteClaim.jsp");
		Claim claim=claimService.getById(id);
		claimService.deleteByid(id);
		mav.addObject(claim);
		return mav;
	}
	
	@RequestMapping("updateClaim")
   public ModelAndView update(@RequestParam int id) {
		ModelAndView mav=new ModelAndView("updateClaim.jsp");
		Claim claim=claimService.update(id);
		mav.addObject(claim);
		return mav;
		
		
		
		
	   
   }
}
