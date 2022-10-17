package assignment;

public class ConditionOperators {

	public static void main(String[] args) {
		
//		1.Find out the greatest number out of three different given numbers:
			int num1 = 25;
			int num2 = 78;
			int num3 = 87;
			if(num1>num2) {
				if(num1>num3) {
					System.out.println(num1 + " is the greatest number");
				}else {
					System.out.println(num3 + " is the greatest number");
				}
			}else if(num2 > num3) {
				System.out.println(num2 + " is the greatest number");

	}else {
		System.out.println(num3 + " is the greatest number");
	}
			
//		2. Write a Java program to test a number is positive or negative.
			int p = 35;
			int n = -11;
			if(p>=0) {
				System.out.println(p + " It is a positive number");
				if(n>=0) {
					System.out.println(n + " It is a positive number");
			}else {
				System.out.println(n + " It is a negative number");
			}
			}else {
				System.out.println(p + " It is a negative number");
			}
}
}