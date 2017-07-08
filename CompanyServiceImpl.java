package com.ranga.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ranga.dao.CompanyDAO;
import com.ranga.entity.Company;
import com.ranga.service.CompanyService;
@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

	public CompanyServiceImpl() {
		System.out.println("Company Service Impl()");
	}

	@Autowired
	private CompanyDAO companyDAO;
	@Override
	public void createCompany(Company c) {
		System.out.println("Company Service");
	}

	@Override
	public Company updateCompanyName(Company c) {
		
		return companyDAO.updateCompanyName(c);
	}

	@Override
	public void deleteCompany(int cid) {
		companyDAO.deleteCompany(cid);
	}

	@Override
	public List<Company> getAllCompanies() {
		
		return companyDAO.getAllCompanies();
	}

	
}
