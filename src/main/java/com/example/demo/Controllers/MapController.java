package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Models.SkillMap;
import com.example.demo.Services.SkillMapService;

@RestController
@RequestMapping("/careercrafters/SkillMap")
@CrossOrigin("http://localhost:3000")
public class MapController {
	@Autowired
	SkillMapService service;
	
	@GetMapping(produces = "application/json")
    public ResponseEntity<List<SkillMap>> getAllSkills() {
        List<SkillMap> skills = service.getAllSkills();        
        return ResponseEntity.ok(skills);
    }
}
