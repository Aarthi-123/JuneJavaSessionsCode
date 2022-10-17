package junesessions;

public class ArithMeticConcepts {

	public static void main(String[] args) {
		
		System.out.println(10/2);//5
		System.out.println(9/2);//4
		System.out.println(9/2.0);//4.5
		System.out.println(9.0/2);//4.5
		System.out.println(8/3);//2
		System.out.println(9.0/2.0);//4.5
		
//		System.out.println(9/0);//if it is a full integer divided by 0 it will show arithmetic exception AE
		
		System.out.println(9.0/0);//infinity -if it is decimal value divided by 0 it will show infinity 
		System.out.println(-2.0/0.0);// -infinity -if it is decimal value divided by 0 it will show -infinity
		
		System.out.println(0/9);//0
		
		System.out.println(9/0.0);//infinity -if it is decimal value divided by 0 it will show infinity
		
		//System.out.println(0/0);//if it is a full integer divided by 0 it will show arithmetic exception
		
		System.out.println(0.0/0);//NaN
		System.out.println(0.0/0.0);//NaN
		System.out.println(0/0.0);//NaN
		
		
		System.out.println(9/9);//1
		System.out.println(100.2/0);//infinity
		//System.out.println(100/0);//AE
		
		System.out.println(9%3);//remainder 0
		System.out.println(9%2);//remainder 1
		System.out.println(11%2);//remainder 1
		System.out.println(17%3);//2
		System.out.println(100/2 + "hello");
		
		String c = "hello";//it is non-primitive datatype so object is used to create String first letter should be in caps
		String d = "world";
		System.out.println(c+" "+d);
		System.out.println(c+' '+d);
	
		
		

	}

}
