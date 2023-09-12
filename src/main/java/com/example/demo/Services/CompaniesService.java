package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Companies;
import com.example.demo.Repository.CompaniesFetch;

@Service
public class CompaniesService {
	@Autowired
	CompaniesFetch fetch;
	
	public Companies create(Companies details) {
		return fetch.save(details);
	}
	public Optional<Companies> read(int companyid){
		return fetch.findById(companyid);
	}
	
	public List<Companies> getAllCompanies() {
        return fetch.findAll();
    }
	
}
