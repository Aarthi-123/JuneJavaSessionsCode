package assignment;

public class Customer {
	
	String name;
	int age;
	String city;
	String product;
	

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.name = "Ravi";
		c1.age = 25;
		c1.city = "Bangalore";
		c1.product = "clothes";
		
		Customer c2 = new Customer();
		c2.name = "Nitin";
		c2.age = 30;
		c2.city = "Delhi";
		c2.product = "vegetables";
		
		Customer c3 = new Customer();
		c3.name = "Ramya";
		c3.age = 35;
		c3.city = "Kerala";
		c3.product = "fruits";
		
		Customer c4 = new Customer();
		c4.name = "Mohit";
		c4.age = 40;
		c4.city = "Andhra";
		c4.product = "groceries";
		
		System.out.println(c1.name+ " "+ c1.age + " "+ c1.city + " "+ c1.product);
		System.out.println(c2.name+ " "+ c2.age + " "+ c2.city + " "+ c2.product);
		System.out.println(c3.name+ " "+ c3.age + " "+ c3.city + " "+ c3.product);
		System.out.println(c4.name+ " "+ c4.age + " "+ c4.city + " "+ c4.product);
		
		System.out.println("----------");
		
		c1 = c2;
		
		System.out.println(c1.name+ " "+ c1.age + " "+ c1.city + " "+ c1.product);
		System.out.println(c2.name+ " "+ c2.age + " "+ c2.city + " "+ c2.product);
		System.out.println(c3.name+ " "+ c3.age + " "+ c3.city + " "+ c3.product);
		System.out.println(c4.name+ " "+ c4.age + " "+ c4.city + " "+ c4.product);
		
		System.out.println("----------");
		
		c2 = c3;
		
		System.out.println(c1.name+ " "+ c1.age + " "+ c1.city + " "+ c1.product);
		System.out.println(c2.name+ " "+ c2.age + " "+ c2.city + " "+ c2.product);
		System.out.println(c3.name+ " "+ c3.age + " "+ c3.city + " "+ c3.product);
		System.out.println(c4.name+ " "+ c4.age + " "+ c4.city + " "+ c4.product);
		
		System.out.println("----------");
		
		c3 = c4;
		
		System.out.println(c1.name+ " "+ c1.age + " "+ c1.city + " "+ c1.product);
		System.out.println(c2.name+ " "+ c2.age + " "+ c2.city + " "+ c2.product);
		System.out.println(c3.name+ " "+ c3.age + " "+ c3.city + " "+ c3.product);
		System.out.println(c4.name+ " "+ c4.age + " "+ c4.city + " "+ c4.product);
		
		System.out.println("----------");
		
		c4 = c1;
		System.out.println(c1.name+ " "+ c1.age + " "+ c1.city + " "+ c1.product);
		System.out.println(c2.name+ " "+ c2.age + " "+ c2.city + " "+ c2.product);
		System.out.println(c3.name+ " "+ c3.age + " "+ c3.city + " "+ c3.product);
		System.out.println(c4.name+ " "+ c4.age + " "+ c4.city + " "+ c4.product);

	}

}
