package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.JobLists;

@Repository

public interface JobFetch extends JpaRepository<JobLists, Integer>{
	List<JobLists> findByCompany(String company);
}
