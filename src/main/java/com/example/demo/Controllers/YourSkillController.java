package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.YourSkills;
import com.example.demo.Repository.YourSkillFetch;
import com.example.demo.Services.YourSkillService;

@RestController
@RequestMapping("/careercrafters/yourskills")
@CrossOrigin("http://localhost:3000")
public class YourSkillController {
	
	@Autowired
	YourSkillService skillservice;
	
	@Autowired
	YourSkillFetch skillrepo;
	
	@PostMapping(produces = "application/json", consumes="application/json")
	public ResponseEntity<YourSkills> create(final @RequestBody YourSkills skill){
		YourSkills skills = skillservice.create(skill);
		return ResponseEntity.ok(skills);
	}
	
	@GetMapping(value="/{username}", produces="application/json")
	public List<YourSkills> obtainedskills(@PathVariable String username){
		return skillrepo.findByUsername(username);
				
	}
	

}
