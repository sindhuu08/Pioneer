
package com.ranga.dao.impl;

import com.ranga.dao.CompanyDAO;
import com.ranga.dao.EmployeeDAO;
import com.ranga.entity.Company;
import com.ranga.entity.Employee;
import com.ranga.util.HibernateUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CompanyDAOImpl implements CompanyDAO {
    
	public CompanyDAOImpl() {
    	System.out.println("CompanyDAOImpl");
    }
	
	
	@Autowired
    private HibernateUtil hibernateUtil;

    
	@Override
	public void createCompany(Company c) {
		System.out.println("Success");
	}


	@Override
	public Company updateCompanyName(Company c) {
		
		return hibernateUtil.update(c);
	}


	@Override
	public void deleteCompany(int cid) {
		Company c=new Company();
		c.setCid(cid);
		hibernateUtil.delete(c);
	}

	@Override
	public List<Company> getAllCompanies() {
			return hibernateUtil.fetchAll(Company.class);
	}


	}



