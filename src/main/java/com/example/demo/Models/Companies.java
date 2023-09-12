package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="companies_list")
public class Companies {
	@Id
	private int CompanyId;
	public int getCompanyId() {
		return CompanyId;
	}
	public void setCompanyId(int companyId) {
		CompanyId = companyId;
	}
	public String getCompanyname() {
		return Companyname;
	}
	public void setCompanyname(String companyname) {
		Companyname = companyname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	public String getCountry_orgin() {
		return country_orgin;
	}
	public void setCountry_orgin(String country_orgin) {
		this.country_orgin = country_orgin;
	}
	private String Companyname;
	private String description;
	private String ratings;
	private String country_orgin;
	
}
