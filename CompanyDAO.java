package com.ranga.dao;

import java.util.List;

import com.ranga.entity.Company;

public interface CompanyDAO {
	public void createCompany(Company c);
	public Company updateCompanyName(Company c);
	public void deleteCompany(int cid);
	public List<Company> getAllCompanies();
	
	
}
