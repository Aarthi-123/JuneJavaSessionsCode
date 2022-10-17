package junesessions;

public class CustomersConstructor {
	
	String name;//instance of class or template variables
	int age;
	String city;
	String phone;
	
	//create customers with different combinations
	//no default value types of customer
	//method:bussiness logic--feature
	//const: never define the bussiness logic
	
	public CustomersConstructor(String name) {
		this.name = name;//this.name represents the class variables(global var) and name represents the local var
	}
	
	public CustomersConstructor(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public CustomersConstructor(String name, int age, String city, String phone) {
		
		this.name = name;
		this.age = age;
		this.city = city;
		this.phone = phone;
	}

	public static void main(String[] args) {
		
		CustomersConstructor c1 = new CustomersConstructor("Tom");
		System.out.println(c1.name);
		
		CustomersConstructor c2 = new CustomersConstructor("Gurjeet", 25);
		System.out.println(c2.name + " " + c2.age + " " + c2.city + " " + c2.phone);//for city and phone it will take the default value
		
		CustomersConstructor c3 = new CustomersConstructor("venkat", 29, "pune" , "9898989898");
		System.out.println(c3.name +  " " + c3.phone);
		
		

	}

}
