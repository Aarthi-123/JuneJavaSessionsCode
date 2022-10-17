package ExceptionHandling;

public class TryCatchBlock {
	String name;
	
	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		int a = 9;
		int b = 0;
		
		//Thread.sleep(4000);
//		File file = new File("test.png");
//		FileInputStream ip = new FileInputStream(file);
		
		try {
			TryCatchBlock obj =  new TryCatchBlock();
			obj=null;
			obj.name = "aarthi";
			
			int i = a/b;//AE
			System.out.println("hello");
			System.out.println("hello");
			System.out.println("hello");
		}catch(ArithmeticException e){//always use what exception u will get use that exception names(ArithmeticException is the one of the class in Exception class)
			System.out.println("AE is cmng...");
			e.printStackTrace();//it will just print the what exception it is
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming...");
			e.printStackTrace();
		}
		
		System.out.println("bye");
		
		try {
			int p = 9/0;
		}catch(ArithmeticException e) {
			String n = "test";
			if(n.equals("test")) {
				System.out.println(true);
			}
		}
		catch(Error e) {
		
		System.out.println("NPE is coming....");
		e.printStackTrace();
			
		}
//		catch(Throwable e) {
//			
//		}
//		catch(Object e) {
//			
//		}//error u cant use the object in the catch block

	}

}

//bcoz of using try catch block it will get the exception and proceed the next step of coding it wont stop inbetween the code bcoz of exception

//Hierarchy of Exception?
//exception is nothing but unwanted line is cmng means it will get terminated
//when exception is cmng it will go to catch block
//Exception and Error are the default class
//in the Exception default class there will be the sub class of AE,NPE, AIOB, IOB etc
//Error class is very rare to occur eg.stack overflow error
//Exception class will occur bcoz of the wrong programming so it will occur frequently
//What is the super class error and exception?
//Throwable class
//what is the super class of throwable?
//Object class---error will occur u cant use the object in the catch block

//u can use "n" no. of try catch method also
//inside the catch u can write logic but u cant write the method

//2 types of exception
//checked and unchecked exception
//checked-----------compile time exception
//unchecked----------runtime exception


//Errors and runtime exception----------AE, NPE all are unchecked exception

//trycatch---------it will handle the exception
//throws---it will just throws the exception, it will be used in the method
//throw---it will delebrately throw the exception
//finally block----exception is cmng or not, it always go to finally and execute the block
