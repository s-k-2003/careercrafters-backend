package com.example.demo.Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Register;
import com.example.demo.Repository.RegisterFetchData;

@Service
public class RegisterServices {
	@Autowired
	RegisterFetchData fetchdata;
	public Register create(Register details) {
		return fetchdata.save(details);
	}

	public Register update(Register details) {
		return fetchdata.save(details);
	}
	

}