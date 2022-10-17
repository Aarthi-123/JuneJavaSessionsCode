package oop_encapsulation;

public class LoginPage {
	
	//its calling from RegTest
	
	private String userName;
	private String password;
	
	public String email;//u can access from any class, call thru ref name bcoz it is public

	//const:
	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
		
	}
	
	//getter and setter:
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void doLogin() {
		System.out.println("enter userName: "+ userName);
		System.out.println("enter password: " + password);
		System.out.println("click on login: ");
		System.out.println("user is logged in...");
	}
	

}
