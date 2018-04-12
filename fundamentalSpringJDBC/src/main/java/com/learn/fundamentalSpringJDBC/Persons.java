package com.learn.fundamentalSpringJDBC;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONS")
public class Persons {
	
	@Id
	@GeneratedValue
	private int personID;
	@Column(name ="Lastname")
	private String lastName;
	@Column(name ="Firstname")
	private String firstName;
	private String city;
	
	
	public Persons() {
	}
	
	
	public Persons(int personID, String lastName, String firstName, String city) {
		super();
		this.personID = personID;
		this.lastName = lastName;
		this.firstName = firstName;
		this.city = city;
	}
	
	public Persons(String lastName, String firstName, String city) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.city = city;
	}


	/**
	 * @return the personID
	 */
	public int getPersonID() {
		return personID;
	}
	/**
	 * @param personID the personID to set
	 */
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persons [personID=" + personID + ", lastName=" + lastName + ", firstName=" + firstName + ", city="
				+ city + "]";
	}
	
	
	
}
