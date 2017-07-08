package com.ranga.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ranga.entity.Company;
import com.ranga.service.CompanyService;

@Controller
public class CompanyController {
private static final Logger logger = Logger.getLogger(CompanyController.class);
	
	public CompanyController() {
		System.out.println("CompanyController()");
	}

	 @Autowired
	    private CompanyService companyService;

	    @RequestMapping("createCompany")
	    public ModelAndView createEmployee(@ModelAttribute Company c) {
	    	logger.info("Creating company. Data: "+c);
	        return new ModelAndView("companyForm");
	    }
	    
	    @RequestMapping("editCompany")
	    public ModelAndView editEmployee(@RequestParam int id, @ModelAttribute Company c) {
	    	logger.info("Updating the company for the Id "+id);
	        c = (Company) companyService.getAllCompanies();
	        return new ModelAndView("companyForm", "companyObject", c);
	    }
	    
	    @RequestMapping("saveCompany")
	    public ModelAndView saveEmployee(@ModelAttribute Company c) {
	    	logger.info("Saving the Employee. Data : "+c);
	        if(c.getCid()==0){ // if employee id is 0 then creating the employee other updating the employee
	        	companyService.createCompany(c);
	        } else {
	        	companyService.updateCompanyName(c);
	        }
	        return new ModelAndView("redirect:getAllCompanies");
	    }
	    
	    @RequestMapping("deleteCompany")
	    public ModelAndView deleteCompany(@RequestParam int id) {
	    	logger.info("Deleting the Company. Id : "+id);
	        companyService.deleteCompany(id);
	        return new ModelAndView("redirect:getAllCompanies");
	    }
	    
	    @RequestMapping(value = {"getAllCompanies"})
	    public ModelAndView getAllCompanies() {
	    	logger.info("Getting the all Employees.");
	        List<Company> companyList = companyService.getAllCompanies();
	        return new ModelAndView("companyList", "companyList", companyList);
	    }
	    
	   
}
