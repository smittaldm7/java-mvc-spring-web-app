package com.spring.model;

public class Customer {
	
	public Customer(int custId, String name, int age) {
		super();
		this.id = custId;
		this.name = name;
		this.age = age;
	}
	
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	int id;
	String name;
	int age;
	//getter and setter methods
	public int getCustId() {
		return id;
	}
	public void setCustId(int custId) {
		this.id = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
