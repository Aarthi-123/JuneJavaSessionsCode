package junesessions;

public class EmployeeTypeConstructor {
	
	String name;
	int age;
	double salary;
	
	//constructor of the class
	//const...name is the same name as the class name but function name can be anything
	//const... cannot return anything but function may or may not return
	//const...no void keyword and no static keyword, bcoz static is the separate memory
	//const... will be called when the obh=ject is created, but function will be called using the object reference name
	//const... methodoverloading is possible
	
	public void test() {//method
		System.out.println("test method...");
	}
	
	public EmployeeTypeConstructor() {//0 param
		System.out.println("default constructor...");
	}
	
	public EmployeeTypeConstructor(int a) {//1 param
		System.out.println("one param..."+a);
	}
	
	

	public EmployeeTypeConstructor(int a, String b) {//2 params
		System.out.println("two param..."+a+b);
	}
	
	

	public static void main(String[] args) {
		EmployeeTypeConstructor e1 = new EmployeeTypeConstructor(10,"tom");
		e1.test();
		

	}

}

	//const... intialization of class variables
	//const... is used to restrict the unnecessary creation of object
	//eg. each employee have specific info, its not like all the employee should have the similar datas of all the class variables,
	//if you create the object the garbage collector wont delete the unnecessary object, bcoz all the object have reference name, so
	//it wont delete
	
	//without const... there will be a hidden and default constructor in java
	
	//constructor chaining -- const... is not possibe using super keyword you can call
	//const.. is independent to each other
	
	
	//How to create the automatic constructor?
	//right click, click source again, then click generate constructor using fields

	
