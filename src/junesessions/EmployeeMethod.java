package junesessions;

public class EmployeeMethod {
	
	//Functions or Method
	//data members: class variables and method
	// can not create a method inside a method
	// methods are independent or parallel to each other
	
	//Method cannot create inside the another method
	//Methods are always independent, always it is a separate method
	//Inside the main method you cannot write any method
	
	
	//void---> nothing it will return 
	//Inside the void main method you cannot write return statement
	//JVM always come inside the main method and check anything is there, so we have to use to call the method and write inside the main method
	//to call the method first we have to create the object thru object we have to call the method
	
	//1.no input and no return:
	//void===does not return anything
	
	public void test() {//test() is the method ()---is the parenthesis
		System.out.println("test method");//nothing is returned 
		
	}
	
	//2.no input and some return:
	//return type String
	public String getName() {//instead of void you have to use String, bcoz we are returning the String
		System.out.println("get name method");
		String n = "Tom";
		return n;
	}
	
	//
	public int add() {//instead of void you have to use int, bcoz we are returning the int
		System.out.println("add numbers");
		int a = 100;
		int b = 200;
		int c = a+b;
		return c;
	}
	
	//3.some input and some return:
	public int sum(int x, int y) {//inside the bracket is called parameters 
		System.out.println("sum method");
		int total = x + y;
		return total;
	}
	
	// WAF: getMarks--> input param: studentName (String)
		// return the student marks (int)
		// if 1st name is not found --- return ???
	
	public int getMarks(String studentName) {
		System.out.println("getting marks for : "+ studentName);
		
		int marks = 0;
		
		if(studentName.equals("Tom")) {
//			return 90;
			marks = 90;
		}else if(studentName.equals("Peter")) {
//			return 95;
			marks = 95;
		}else if(studentName.equals("Ravi")) {
//			return 0;
			marks = 80;
		}else {
			System.out.println("student name is not found " + studentName);
//			return -1;
			marks = -1;
		}
		
		return marks;
	}
	
	public static void main(String[] args) {
		EmployeeMethod e = new EmployeeMethod();
		e.test();
		
		String name = e.getName();//Always get the return value in the variable
		System.out.println(name + 100);
		System.out.println(name + 500);
		
		//
//		System.out.println(e.getName() + 100);//should not use it directly above method is the correct one
//		System.out.println(e.getName() + 500);
		
		int s = e.add();
		System.out.println(s);
		
		int sum = e.sum(10, 20);//values sending in the bracket is called arguments
		System.out.println(sum);
		
		int m = e.getMarks("Aarthi");
		System.out.println(m);
		
		//int totalMarks = m+ 5;
//		System.out.println(totalMarks);

	}
	

}
