package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Companies;
import com.example.demo.Services.CompaniesService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/careercrafters/companieslist")
@CrossOrigin("http://localhost:3000")
public class CompaniesController {
	@Autowired
	CompaniesService service;
	
	@Operation(summary = "Creates a new Project")
	
	@GetMapping(value = "/{id}", produces = "application/json")
	
	public ResponseEntity<Optional<Companies>> read(final @PathVariable("id") int id){
		Optional<Companies> obtainedcompany = service.read(id);
		return ResponseEntity.ok(obtainedcompany);
	}
	
	@GetMapping(produces = "application/json")
    public ResponseEntity<List<Companies>> getAllCompanies() {
        List<Companies> companies = service.getAllCompanies();
        return ResponseEntity.ok(companies);
    }

}
