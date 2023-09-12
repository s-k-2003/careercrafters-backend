package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="yourskills")
public class YourSkills {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int skill_id;
	public int getSkill_id() {
		return skill_id;
	}
	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSummary() {
		return Summary;
	}
	public void setSummary(String summary) {
		Summary = summary;
	}
	public String getDesired_designation() {
		return desired_designation;
	}
	public void setDesired_designation(String desired_designation) {
		this.desired_designation = desired_designation;
	}
	private String skills;
	@Id
	private String username;
	private String Summary;
	private String desired_designation;
	

}
