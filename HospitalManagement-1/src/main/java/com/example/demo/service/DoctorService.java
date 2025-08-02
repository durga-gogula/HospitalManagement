package com.example.demo.service;

import com.example.demo.entity.Doctor;

public class DoctorService {
	
	
	public String saveDoctor(Doctor d)
	{
		
		if(d.getAdress().equals("pune"))
		{
			return "doctor is added";
		}
		
		return "we want doctor from pune";
	}



public Doctor getDoctor()
{
	Doctor d = new Doctor();
	
	d.setdId(1);
	d.setAdress("pune");
	d.setName("john");
	d.setEmail("j@gmail.com");
	d.setSpl("neuro");
	
	return d;
	
	
}
}
