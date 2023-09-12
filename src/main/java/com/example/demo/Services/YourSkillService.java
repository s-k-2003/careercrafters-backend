package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.YourSkills;
import com.example.demo.Repository.YourSkillFetch;

@Service
public class YourSkillService {
	@Autowired
	YourSkillFetch skillfetch;
	
	public YourSkills create(YourSkills skills) {
		return skillfetch.save(skills);
	}
	
	

}
