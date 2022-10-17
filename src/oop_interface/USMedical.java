package oop_interface;

public interface USMedical extends WHO {
	
	//abstract method have no method body
	//you cannot create any object of interface
	
	int min_fee = 10;//variable in interface are always be static and final by default 
	
	public void pediaServices();//static abstract method can't have bcoz its overriding
	
	public void physioServices();
	
	public void OrthoServices();
	
	public void emergencyServices();//its a common method it present in all the parent interfaces(US,UK,Indian medical)
									//so in fortis hospital it will implement only one time 
	
	//method overloading is possible in interfaces
	public void dentalServices();
	public void dentalServices(int dentists);
	public int dentalServices(int dentists, String dentalMachine);//return type also allowed
	
	//but interface cannot do teh business logic
	//Interface cannot be static
	//overloading can be happen in both class inheritance and inetrface
	//no constructor is allowed in interface
	//for interface you cannot create object
	//you cannot have abstract method in class, but its allowed in abstract classes
	//you can have one class parent not more than one(Medical)
	//Interface cannot have parent class(UN)
	
	//after JDK 1.8
	
	//two major changes
	//1.can have a static method with method body
	
	public static void medicalTraining() {
		System.out.println("USMedical----------staticmedicalTraining");
	}
	
	//2.can have a default method
	default void donation() {//default can be used oly in interface
		System.out.println("USMedical----defaultmethod");
	}
	

}
