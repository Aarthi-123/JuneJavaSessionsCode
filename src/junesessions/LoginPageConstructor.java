package junesessions;

public class LoginPageConstructor {
	
	String username;
	String password;
	
	//hidden/default constructor
	public LoginPageConstructor(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("enter the username"+ un);
		System.out.println("enter the password"+ pwd);
		System.out.println("click on login button");
		System.out.println("user is logged in successfully...");
	}

	public static void main(String[] args) {
		
		LoginPageConstructor user1 = new LoginPageConstructor("admin", "admin123");
		user1.doLogin(user1.username, user1.password);
		
		LoginPageConstructor user2 = new LoginPageConstructor("seller", "seller123");
		user2.doLogin(user2.username, user2.password);
		

	}

}
