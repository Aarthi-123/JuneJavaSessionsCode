package oop_encapsulation;

public class Employee {
	
	//its calling from TestEmp 
	
	
	//private can be used in variables and methods in encapsulation
	//from outside class you cannot access the private variables and methods
	//If from outside class you have to access that private variables and methods from class you have to use thru getter and setter method
	//bcoz of getter and setter method will be public. Thru public u can access private variables and methods 
	//for 1 variable--1 getter and setter
	//so here 6 getter and setter bcoz var is 3 
	//automatic getter and setter ---right click source---click generate getter and setter
	
	//Encapsulation not giving direct access to the data .. so internal data will be encapsulated
	//eg.ATM m/c
	
	//constructor--- acting like a setter method, in encapsulation 
	//usage of setter method is also u can update the variables
	
//	class vars:
	private String name;
	private int age;
	private boolean isPerm;
	
	
	//const:
	public Employee(String name, int age, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.isPerm = isPerm;
	}
	
	//getter and setter:
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


	public boolean isPerm() {
		return isPerm;
	}


	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}
	

}
