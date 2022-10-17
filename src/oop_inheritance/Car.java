package oop_inheritance;

public class Car extends Vehicle {
	
	////its calling from TestCar
	
	//from child you can inherit from parents and grandparents
	//but from parent and grandparents you cannot inherit from child
	//sibling cannot inherit the other siblings
	
	//Vehicle is a grandparent
	//Car is a parent
	//child---BMW, Audi, Honda
	//from child you can extend from parent
	//from car, BMW can take properties from car class
	//you can create 'n' numbers of parent class that is called multi label inheritance
	//if the parent has method in private, you cannot override with child
	//private method cannot be inherit and overridden
	//private method from same class only you can access
	
	//what is polymorphism?
	//explain both methodoverloading and methodoverriding
	//methodoverloading in same class
	//compiler is confused which method to take
	//runtime will identify the method
	
	int speed = 100;
	static final int wheels = 4;//static final variable also cannot be override as final variable
	
	//final:
	//to prevent method overriding---method final
	//there is no concept of variable overriding 
	//overriding concepts apply only on method.
	//to prevent inheritance ---class final 
	//public final class Car extends Vehicle----so Car cannot be the parent anymore
	//to provide constant data---value cannot be changed
	
	//private method cannot be overridden and cannot access from another class
	//final ---prevent method overriding and you can access from another class
	
	
	public void start() {
		System.out.println("car----start");
	}
	
	public void stop() {
		System.out.println("car----stop");
	}
	
	public void refuel() {
		System.out.println("car----refuel");
	}
	
	//static:
	//static method cannot be override bcoz its in separate memory
	//but without @override annotation you can use the same static method from Car in BMW and that is called method hiding
	
	public static void billing() {
		System.out.println("car -- billing");
	}

}

//Multiple parents are nto allowed in inheritance
//Multiple Inheritance are not allowed using interface you can use this

//child class is trying to have multiple parent classes is called diamond problem and it is called multiple inheritance
//Java not support multiple inheritance 
//But multiple inheritance is possible on Interface
//Multi label is allowed means 'n' no. of parent class



