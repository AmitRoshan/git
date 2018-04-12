package com.learn.fundamentalSpringJDBC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//@Repository
public class SpringJdbcDAO {/*
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<Persons> getAll(){
		
		return jdbcTemplate.query("Select * from Persons",
				new BeanPropertyRowMapper<Persons>(Persons.class));
	}
	
	//to add row to table
	public int insert(Persons persons) {
		return jdbcTemplate.update("INSERT INTO Persons (PersonID, LastName, FirstName,City)\n" + 
				"VALUES (?, ?, ?, ?);",
				new Object[] {persons.getPersonID(),persons.getLastName(),persons.getFirstName(), persons.getCity()});
	}
	
	
	//to update record based on id
	public int update(String city, int id) {
		return jdbcTemplate.update("Update Persons set City = ? where PersonID = ?", 
				new Object[] {city, id});
	}
	
	public int deleteByID(int id) {
		return jdbcTemplate.update("Delete from Persons where id = ?", new Object[] {id});
	}
*/}
