package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.YourSkills;

@Repository
public interface YourSkillFetch extends JpaRepository<YourSkills,Integer>{
	List<YourSkills> findByUsername(String username);
}
