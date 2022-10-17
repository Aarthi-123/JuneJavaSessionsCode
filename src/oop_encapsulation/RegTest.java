package oop_encapsulation;

public class RegTest {

	public static void main(String[] args) {

//		reg Page:
		Registration reg = new Registration("ahmed", "ahmed@gmail.com");

		// go to profile page:
		System.out.println(reg.getFirstName() + " " + reg.getEmail());

		System.out.println(reg.getLastName() + " " + reg.getPhonenumber() + " " + reg.getPassword());// o/p default
																										// value

		// profile page: update the info
		reg.setLastName("ahmedkhan");
		reg.setPassword("ahmed123");
		reg.setPhonenumber("98989898");

		// go to profile page:
		System.out.println(reg.getFirstName() + " " + reg.getEmail());

		System.out.println(reg.getLastName() + " " + reg.getPhonenumber() + " " + reg.getPassword());
		
		//LoginPage:
		
		LoginPage adminUser = new LoginPage("admin","admin123");
		adminUser.doLogin();

	}

}
