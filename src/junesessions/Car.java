package junesessions;

public class Car {
	
	//instance class vars:
	String name;
	int price;
	String color;
	boolean isAutomatic;


	public static void main(String[] args) {
		
		//create the object of the class using new keyword:
			Car c1 = new Car();//c1---object reference name ----new Car() is the object
							   //moment of creating the object it will create the photocopy of class variables automatically, referred with reference name c1
							   // you can create multiple objects 
			c1.name = "BMW";
			c1.price = 40;
			c1.color = "white";
			c1.isAutomatic = true;
			
			System.out.println(c1.name + " " + c1.price + " "+ c1.color + " " + c1.isAutomatic);
			
			Car c2 = new Car();//c2---object reference name ----new Car() is the object creating another object
							   //moment of creating the another object it will create the photocopy of class variables automatically, referred with reference name c1

//			System.out.println(c2.name);//it will show the default value of string is null
//			System.out.println(c2.price);//it will show the default value of int is 0
//			System.out.println(c2.color);//it will show the default value of string is null
//			System.out.println(c2.isAutomatic);//it will show the default value of boolean is false
			
			c2.name = "Audi";
			c2.isAutomatic = true;
			
			System.out.println(c2.name);//it will show the Audi
			System.out.println(c2.price);//it will show the default value of int is 0
			System.out.println(c2.color);//it will show the default value of string is null
			System.out.println(c2.isAutomatic);//it will show the value true
			
			//no reference object
			new Car();//without reference object but it will create the object
			
			new Car().name = "Honda";//it will create the separate object without reference name, so memory wastage of creating separate object 
			new Car().price = 40;//it will create the separate object without reference name
			new Car().color = "Red";//it will create the separate object without reference name
			new Car().isAutomatic = false;//it will create the separate object without reference name
			
			System.out.println(new Car().name = "Honda");//again it will create the separate object
			
			//null reference object:
			
			Car t1 = new Car();
			t1 = null;
			t1.name = "swift";//NPE
			System.out.println(t1.name);//NullPointerException  NPE
			
//			System.gc();//if you want to call garbage collector manually and programmatically you can use this it will give the instruction to JVM, 
						//but when the heap memory get suffocated that time only it will work
						//JVM will automatically check those conditions
			
			Car t2 = null;
			t2.name = "Aarthi";//NPE
			System.out.println(t2.name);//NPE
			
			//Heap memory---------------stack memory
			//for object there will be a heap memory and stack memory
			//whenever we create the object new Car(), it will store in heap memory
			//in stack memory the reference name will be stored like c1 c2 
			//in heap memory no reference name object also stored in heap memory
			//in heap first the object is stored in heap memory for null reference object
			//then reference name t1 will be stored in stack memory, then making it as a null -- so it is called as null reference object
			//when the heap memory get overwhelmed, there was a entity is garbage collector. Here JVM will check the heap size if it gets more
			//may be it get crashed. So JVM will send the instruction to the garbage collector.
			//so garbage collector come inside the heap memory it will destroy the no reference object and null reference object
			//you can also increase the heap size
			//garbage collector mechanism only work with heap memory not stack memory
			//Java has own garbage collector so it will do automatically
		
			}

}
