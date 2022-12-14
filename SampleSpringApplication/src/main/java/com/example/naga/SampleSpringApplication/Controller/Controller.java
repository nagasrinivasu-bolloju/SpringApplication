package com.example.naga.SampleSpringApplication.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/getdata")
	public List<Customer2> getAllRecords()
	{
		return custRepo.findAll();
	}

	@PostMapping("/savedata")
	public Customer2 saveCust(@RequestBody InputCustomer inCustomer)
	{
		Customer2 cust=new Customer2(inCustomer.getId(),inCustomer.getName());
		return custRepo.save(cust);
//		return "saved Succussfully";	
	}
	
	@PutMapping("/updaterecord")
	public Customer2 updateCust(@RequestBody InputCustomer incustomer)
	{
		Optional<Customer2> c=custRepo.findById(incustomer.getId());
		Customer2 customer2=c.get();
		customer2.setName(incustomer.getName());
		return custRepo.save(customer2);
	}
	
	@DeleteMapping("/deleterecord")
	public void deleteCust(@RequestBody InputCustomer incustomer)
	{
		Optional<Customer2> c=custRepo.findById(incustomer.getId());
		Customer2 customer2=c.get();
		custRepo.delete(customer2);
	}
}
