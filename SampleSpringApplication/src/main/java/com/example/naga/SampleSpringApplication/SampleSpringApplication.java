package com.example.naga.SampleSpringApplication;

 

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringApplication {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println("SpringApplication Started At :"+date.toString());
		SpringApplication.run(SampleSpringApplication.class, args);
		System.out.println("Spring Application completed at:"+date.toString());
	}

}
