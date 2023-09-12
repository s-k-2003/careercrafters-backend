package com.example.demo.Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Repository.JobFetch;

@Service
public class JobService {
	@Autowired
	JobFetch fetch;
	
	
}
