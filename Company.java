package com.ranga.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "Companyabcxyz")
public class Company implements Serializable {
	
	private static final long serialVersionUID = -7988799579036225137L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
	
    @Column
    private String cname;
    
    @Column
    private int exp;
    
    @Column
    private String role;

    

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Company() {
    }

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", exp=" + exp + ", role=" + role + "]";
	}
    
   
}