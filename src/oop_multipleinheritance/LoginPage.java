package oop_multipleinheritance;

public class LoginPage extends Page {
	
	//its calling from PageTest
	
	@Override
	public void getColor() {
		System.out.println("Login Page -- Orange color");
	}
	
	public void doLogin() {
		System.out.println("do login");
	}

}
