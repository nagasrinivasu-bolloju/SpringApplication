package com.example.naga.SampleSpringApplication.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import Repo.CustomerRepository;
import entity.Customer2;
import entity.InputCustomer;


@RestController
public class Controller
{
	
	@Autowired
	CustomerRepository custRepo;
	
	Date date=new Date();
	
	@GetMapping("/demo")
	public String demo()
	{
		return "Hii This is my first Rest API called at: "+date.toString();
	}
	
	@PostMapping("/savedata")
	public Customer2 saveCust(@RequestBody InputCustomer inCustomer)
	{
		Customer2 cust=new Customer2(inCustomer.getId(),inCustomer.getName());
		return custRepo.save(cust);
//		return "saved Succussfully";	
	}
}
