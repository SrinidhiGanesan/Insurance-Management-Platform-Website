package com.example.SpringBoot.InsuranceManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringBoot.InsuranceManagement.model.InsurancePolicy;
import com.example.SpringBoot.InsuranceManagement.repository.InsurancePolicyRepository;
import com.example.SpringBoot.InsuranceManagement.service.InsurancePolicyService;

@Controller
public class InsurancePolicyController {
    @Autowired
	private InsurancePolicyRepository policyRepository;
	@Autowired
	private InsurancePolicyService policyService;
	
	
	@RequestMapping("index1")
	public String index1() {
		return "index1.jsp";
	}
	
	@RequestMapping("createInsurance")
	public String createPolicy(InsurancePolicy policy) {
		policyService.createPolicy(policy);
		return"index1";
	}
	
	@RequestMapping("getPolicy")
	 public ModelAndView getPolicy(@RequestParam int id) {
		 ModelAndView mav=new ModelAndView("showPolicy.jsp");
		 InsurancePolicy insurancePolicy=policyService.getPolicy(id);
		 mav.addObject(insurancePolicy);
		 return mav;
	 }
	
	@RequestMapping("deletePolicy")
	 public ModelAndView deletePolicy(@RequestParam int id) {
		 ModelAndView mav=new ModelAndView("deletePolicy.jsp");
		 InsurancePolicy insurancePolicy=policyService.getPolicy(id);
		 policyService.deletePolicy(id);
		 mav.addObject(insurancePolicy);
		 return mav;
	 }
	
	@RequestMapping("updatePolicy")
	public ModelAndView updatePolicy(@RequestParam int id) {
		ModelAndView mav=new ModelAndView("updatePolicy.jsp");
		InsurancePolicy insurancePolicy=policyService.updatePolicy(id);
		mav.addObject(insurancePolicy);
		return mav;
	}
	
	
	
	
}
