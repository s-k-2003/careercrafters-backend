package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.JobLists;
import com.example.demo.Repository.JobFetch;

@RestController
@RequestMapping("/careercrafters/joblist")
@CrossOrigin("http://localhost:3000")
public class JobController {
	@Autowired
	JobFetch jobrepo;
	@GetMapping(value="/{company}",produces="application/json")
	public List<JobLists> obtainedjobs(@PathVariable String company){
		return jobrepo.findByCompany(company);
	}
}
