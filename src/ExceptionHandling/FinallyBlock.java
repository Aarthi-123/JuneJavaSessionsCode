package ExceptionHandling;

public class FinallyBlock {
	
	public static int getMarks(String stuName) {
		System.out.println("getting marks for: "+ stuName);
		
		if(stuName.equals("Tom")) {
			try {
				int i = 9/3;
				System.exit(1);//shutdown JVM
				System.out.println("helloooooo");
				return 85;
			}
			catch(ArithmeticException e) {
				System.out.println("AE is cmng...");
				return 50;
			}
			finally {
				System.out.println("im in finally block");
				return 10;
			}
		}
			
//			return 100;
			
			else if (stuName.equals("peter")) {
				return 90;
			}

			else if (stuName.equals("gaurav")) {
				return 85;
			}

			else {
				System.out.println("stu name is not found...");
				return -1;
			}
		}
	

	public static void main(String[] args) {
		
		int m = getMarks("Tom");
		System.out.println(m);
		
		
		
		
//		System.out.println("A");
//		
//		try {
//			int i =9/0;
//			System.out.println("hello exception");
//		}
//		catch(ArithmeticException e) {
////			e.printStackTrace();
//			System.out.println("AE is cmng....");
//		}
//		finally {
//			System.out.println("im in finally block");
//		}
		
		
		//use cases:
				//user1: Gurjeet
				//create a DB connection: un/pwd --- PASS
				
				//hit a SQL --- PASS
				
//				try {
//				//get the results --- FAIL -- Exception
//				}
//				catch() {
//					SQLEXCEPTION
//				}
				
//				finally {
//				//close the DB connection
//			}
				
				//store the results
				//print the results
				

				
				
				//user2: lokesh
						//create a DB connection: un/pwd --- PASS
						
						//hit a SQL --- PASS
						
//						try {
//						//get the results --- FAIL -- Exception
//						}
//						catch() {
//							SQLEXCEPTION
//						}
						//store the results
						//print the results
				
				
				
				//user3: geet
				//create a DB connection: un/pwd --- PASS
				
				//hit a SQL --- PASS
				
//				try {
//				//get the results --- FAIL -- Exception
//				}
//				catch() {
//					SQLEXCEPTION
//				}
				//store the results
				//print the results
	}

}

//exception is cmng or not, it will always go to finally block and execute the block
//try block is possible without catch block if final block is present, but its not right way to write
//duplicate finally block is not allowed only one block is allowed
//before try block you cant write finally block and you cant write alone also
//finally always come with try catch block
//so it always return the value from finally block
//it will always hold the return value in try or catch. If the finally block is there with return value, always it will
//print the return value of finally block
