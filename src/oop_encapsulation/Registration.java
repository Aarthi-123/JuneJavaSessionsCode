package oop_encapsulation;

public class Registration {
	
	//its calling from RegTest 
	
	private String firstName;
	private String lastName;
	private String phonenumber;
	private String password;
	private String email;
	
	//const:
	public Registration(String firstName, String email) {
		this.firstName = firstName;
		this.email = email;
	}

	public Registration(String firstName, String lastName, String password, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}

	public Registration(String firstName, String lastName, String phonenumber, String password, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phonenumber = phonenumber;
		this.password = password;
		this.email = email;
	}
	
	//getter and setter

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
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
	
	
	
	
	
	

}
