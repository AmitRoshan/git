package com.learn.fundamentalJPA.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Account {
	
	@Id
	private int accno;
	private String name;
	private double bal;
	/**
	 * @return the accno
	 */
	public int getAccno() {
		return accno;
	}
	/**
	 * @param accno the accno to set
	 */
	public void setAccno(int accno) {
		this.accno = accno;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the bal
	 */
	public double getBal() {
		return bal;
	}
	/**
	 * @param bal the bal to set
	 */
	public void setBal(double bal) {
		this.bal = bal;
	}
	
	
}
