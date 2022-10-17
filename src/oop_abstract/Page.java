package oop_abstract;

public abstract class Page {

	//cannot create the objects of abs class
	//can have abs + non abs methods in abs class
	//can we create the object for abs class?
	//Ans :yes
	//but this will called when you create the object of child class
	
	//hidden/default class
	
	//in abstract class:
	//1.No(zero) abs... method---yes---0% abstraction
	//2.only abs---method----yes---100% abstraction
	//3.abs+ non abs ---method---yes---partial abstraction
	
	//Interface:
	//100% abstraction
	
	//constructor:
	public Page() {
		System.out.println("page---default---const...");
		}
	
	public Page(int i) {
		System.out.println("page...const.."+ i);
	}
	
	public abstract void title();//this cannot be final bcoz u have to implement in child class
	public abstract void url();
	
	public void timeOut() {
		System.out.println("page...timeout: 20 secs");
	}
	
	public final void displayLogo() {
		System.out.println("page---displaylogo");
	}
}

//abstract method will be implemented by child class method thru override method
//final-------to prevent override
//constructor can be created in abstract
//constructor in abstract class can be methodoverloaded
//if constructor written with parameterised constructor, mandatory to write the default constructor
//if there is no parameterised constructor, ther will be a hidden or default constructor

//when to use abstract class and interface?
//100% abstraction-------------use interface
//to design the web page we have to define the method in abstract class bcoz in web page we have to time out and url 
//so we have to use the method body so abstract class is the best method to pick

//web driver is a concept it should in interface... webdriver cannot take business logic
//it is the responsibility to get title etc....so it is the browser(chrome, firefox, safari) responsibility....
//so in this case we have to use the interface
