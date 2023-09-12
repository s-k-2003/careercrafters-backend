package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Register;

@Repository
public interface RegisterFetchData extends JpaRepository<Register, String>{
	List<Register> findByUsername(String username);
}
