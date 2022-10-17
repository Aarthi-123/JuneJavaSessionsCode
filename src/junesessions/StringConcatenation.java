package junesessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		System.out.println(a + b);
		
		String x = "hello";
		String y = "world";
		
		double d1 = 12.33;
		double d2 = 12.44;
		
		char c1 = 'a';
		char c2 = 'b';
		
		System.out.println(x + y);//helloworld
		System.out.println(a+x);//100hello
		System.out.println(x+a);//hello100
		System.out.println(x+y+a+b);//helloworld100200
		
		System.out.println(x+y+(a+b));//helloworld300
		
		System.out.println("hello world aarthi");//hello world aarthi
		System.out.println("the value of a :"+ a);//the value of a: 100
		System.out.println("the value of b : " + b);//the value of a: 200
		System.out.println("the sum is: " + (a+b));//the sum is: 300
		
		System.out.println(a+b+x+y+a+b);//100200helloworld100200
		System.out.println(a+b+x+y+(a+b));//100200helloworld300
		System.out.println(x+y+d1+d2);//helloworld12.3312.44
		System.out.println(x+c1);//helloa
		System.out.println(x+y+(c1+c2));//helloworld195
		

	}

}
