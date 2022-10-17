package junesessions;

public class CustomerStaticMethod {
	
	String name;
	int age;
	static String companyName = "Amazon";
	
	public void sendMail() {//non static method
		System.out.println("send mail");
		CustomerStaticMethod.getInfo();//calling static method thru class name
	}
	
	public static int getInfo() {
		System.out.println("get info");
		int i = 10;
		int j = 20;
		return 100;
	}

	public static void main(String[] args) {
		
		CustomerStaticMethod c = new CustomerStaticMethod();
		
		c.name = "Priyanka";
		c.age = 25;
		
//		CustomerStaticMethod.companyName = "BMW"; //you can change the static variable also
		
		System.out.println(c.name+ " "+c.age+" "+CustomerStaticMethod.companyName);
		System.out.println(companyName);//direct access but not recommended
		
		//How to access the static method:
		//1.use the class name
		int a = CustomerStaticMethod.getInfo();
		System.out.println(a);
		//2.calling directly
		getInfo();
		//3.using obj ref?
		System.out.println(c.getInfo());//it will show warning not recommended
		
		// how to access non static vars and methods: we have to create the object
				c.sendMail();

	}

}
