package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Models.SkillMap;
import com.example.demo.Repository.SkillMapFetch;

@Service
public class SkillMapService {
	@Autowired
	SkillMapFetch skillRepo;
	
	public List<SkillMap> getAllSkills() {
        return skillRepo.findAll();
    }
}
