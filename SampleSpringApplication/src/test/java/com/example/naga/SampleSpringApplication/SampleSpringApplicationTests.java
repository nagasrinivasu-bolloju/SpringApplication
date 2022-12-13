package com.example.naga.SampleSpringApplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Repo.CustomerRepository;

@SpringBootTest
class SampleSpringApplicationTests {

	@Autowired
	private CustomerRepository custRepo;
	@Test
	void contextLoads() {
	}
	
	@Test
	void testRepo()
	{
		String className=this.custRepo.getClass().getName();
		String packName=this.custRepo.getClass().getPackageName();
		System.out.println(className);
		System.out.println(packName);

	}
}
