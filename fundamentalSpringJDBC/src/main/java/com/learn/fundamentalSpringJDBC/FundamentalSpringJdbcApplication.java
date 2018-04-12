package com.learn.fundamentalSpringJDBC;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentalSpringJdbcApplication implements CommandLineRunner{

	/*@Autowired
	SpringJdbcDAO dao;*/
	
	/*@Autowired
	SpringJpaRepository repository;*/
	
	@Autowired
	PersonSpringDataRepository repository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(FundamentalSpringJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Optional<Persons> persons = repository.findById(100001);
		
		repository.save(new Persons("Kumar", "Nitish", "patna"));
		
		repository.deleteById(1);
		
		
		List<Persons> personslist = repository.findAll();
		/*
		 SpringJpaRepository
		 
		 
		 Persons personToAdd = new Persons("Kumar", "Ravi", "patna");
		 repository.update(personToAdd);
		
		Persons person = repository.findById(1);
		System.out.println(person);*/
		
		
		/*
		 SpringDao
		 
		 int noOfField = dao.insert(new Persons(10002, "chandra", "suresh", "delhi"));
		
		System.out.println("No of recorded add =  "+ noOfField);
		
		List<Persons> list = dao.getAll();
		
		System.out.println(list);
		
		noOfField = dao.update("uttarakhand", 10002);
		
		System.out.println("No of recorded updated =  "+ noOfField);
		
		list = dao.getAll();
		
		System.out.println(list);
		
		noOfField = dao.deleteByID(10001);*/
		
	}
}
