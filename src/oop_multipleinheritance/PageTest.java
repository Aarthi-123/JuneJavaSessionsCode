package oop_multipleinheritance;

public class PageTest {

	public static void main(String[] args) {
	
		LoginPage lp =  new LoginPage();
		
		lp.doLogin();
		
		lp.getColor();//orange color
		
		CartPage cp = new CartPage();
		cp.getColor();//red color from Page class bcoz in CartPage class no getColor() method so it inherit from Page class
		
		//can be again and again you can override the method from grandparents to child

	}

}
