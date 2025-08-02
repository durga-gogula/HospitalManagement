package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController

public class DoctorController {
	
	DoctorService ds = new DoctorService();
	
	@PostMapping("addDoctor")
	
	String addDoctor(@RequestBody Doctor d)
	
	{
		
		
	return ds.saveDoctor(d);
		
		
	}
	
	@GetMapping("getDoctor")
	Doctor getDoctor()
	{
		
//		Doctor d = ds.getDoctor();
		
		return ds.getDoctor();
		
		
	}

}
