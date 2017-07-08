package com.ranga.service;

import java.util.List;

import com.ranga.entity.Company;

public interface CompanyService {
	public void createCompany(Company c);
	public Company updateCompanyName(Company c);
	public void deleteCompany(int cid);
	List<Company> getAllCompanies();
}
