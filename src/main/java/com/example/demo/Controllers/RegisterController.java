package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Register;
import com.example.demo.Repository.RegisterFetchData;
import com.example.demo.Services.RegisterServices;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/careercrafters/registerdata")
@CrossOrigin
public class RegisterController {
	@Autowired
	RegisterServices regservice;
	
	@Autowired
	RegisterFetchData registerRepo;
	
	//CREATION
	
	@Operation(summary = "Register new user")
	
	@ApiResponses(value = 
{
	@ApiResponse(responseCode = "200", description="User Registed Successfully"),
	@ApiResponse(responseCode = "401", description="Invalid User"),
	@ApiResponse(responseCode = "404", description ="Not Found")
			
})
	@ResponseStatus(HttpStatus.CREATED)
	
	@PostMapping(produces = "application/json", consumes="application/json")
	
	public ResponseEntity<Register> create(final @RequestBody Register details){
		Register category = regservice.create(details);
		return ResponseEntity.ok(category);
	}
	
	
	@GetMapping(value="/{username}", produces="application/json")
	public List<Register> obtainedinfo(@PathVariable String username){
		return registerRepo.findByUsername(username);
				
	}
	
	
	
}
