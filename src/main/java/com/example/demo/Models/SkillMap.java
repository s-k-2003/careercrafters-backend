package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="skill_list")
public class SkillMap {
	@Id
	private int skill_id;
	public int getSkill_id() {
		return skill_id;
	}
	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGainknowledge() {
		return gainknowledge;
	}
	public void setGainknowledge(String gainknowledge) {
		this.gainknowledge = gainknowledge;
	}
	private String skillname;
	private String description;
	private String gainknowledge;
	
}
