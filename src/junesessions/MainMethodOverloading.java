package junesessions;

public class MainMethodOverloading {

	public static void main(String[] a) {
		
		//when we pass the value to the String[] in the main method you can pass oly thru command line arguments
		
		//entry point of JVM is main method. you can overload the main method but practically we wont overload the main method
		//whatever main method you overload it will enter oly to the main(String[] args) 
		//String used bcoz, most of the datatype used is String, u can change the variable name 'args' to 'a' it doesn't matter
		
		//Main method also static so it will stored in CMA
		//who is calling the main method?
		//JVM will call directly no need to create object
		
		
		System.out.println(a.length);//0
//		System.out.println(a[0]);//AIOB
		System.out.println("hi...I am main");
		
		MainMethodOverloading.main();
		MainMethodOverloading.main(10);
	}
	
	public static void main() {
		System.out.println("bye...");
	}
	
	public static void main(int i) {
		System.out.println("pop.."+i);
	}

}
