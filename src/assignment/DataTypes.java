package assignment;

public class DataTypes {

	public static void main(String[] args) {
		
//		1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
			String a = "Hello";
			String name = "Aarthi";
			System.out.println(a);
			System.out.println(name);
			
//		2. Write a Java program to print the sum of two numbers.
			int s = 74;
			int r = 36;
			System.out.println(s+r);
			
//		5. Write a Java program to compute the specified expressions and print the output. Go to the editor Test Data:
			float f = 25.5f;
			float f1 = 3.5f;
			float f2 = 40.5f;
			float f3 = 4.5f;
			System.out.println((f*f1-f1*f1)/(f2-f3));
			
//			6. Try to concat "Hello Selenium" with a character 't'.
					String s1 = "Hello Selenium";
					char t1 = 't';
					System.out.println(s1+t1);
					
//			7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
					int a1= 100;
					int a2 = 200;
					int a3 = 3400;
					int total = a1+a2+a3;
					System.out.println("Your Total Amount : "+ total);
					
//			8. What should be the output for :
					byte b3 = 065;//octal number base 8 range should(0-7)
					//065 = (0x8^2) + (6x8^1) + (5x8^0) = 53
					System.out.println(b3);
					
					int b = 0651;//425
					System.out.println(b);
					
					//0651 = (0 × 8³) + (6 × 8²) + (5 × 8¹) + (1 × 8⁰) = 425
	}

}
