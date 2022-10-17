package junesessions;

public class LoopConcept {

	public static void main(String[] args) {
	
		
		//1 to 10
		//1.while loop:
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
//			++i;
//			i=i+1;you can use whatever method to increase the value of 'i'
		}
		
		System.out.println("-----------");
		
		//1 to 10:0 2 4 6 8 ---even
		int e = 0;
		while(e<=10) {
			if(e%2==0) {
				System.out.println(e);
			
			}
			e++;
		}
		
		System.out.println("-----------");
		
		//1 to 10: 1 3 5 7 9----odd
		int h = 1;
		while(h<=10) {
			System.out.println(h);
			h = h +2;
		}
		
		System.out.println("-----------");
		
		//infinite loop
		//to avoid infinite loop you have to use correct logic or break
		
		
		while(true) {
			System.out.println("....Welocome to Taj Hotel....");//it will print infinite times to stop it you have to use break
			break;
		}
		
		System.out.println("-----------");
		
		//1 to 100
		//multiplication of 5---print hi...
		int k =1;
		while(k<=100) {
			System.out.println(k);
			if(k%5==0) {
				System.out.println("hi....");
			}
			if(k==50) {
				System.out.println("half century...");
			}
			if(k==100) {
				System.out.println("century...");
			}
			k++;
		}
		
		// use cases of while:
				// when number of iterations are not fixed:
				// page loading time
				// number of web elements on the page--10, 20, 40, 5
				// web table - pagination--> 1 2 3 4 5 6 7...next
		
		System.out.println("-----------");
		
		//2.for loop:
		//1 to 10:
//		for(int t=0;t<=10;t++) {
//			System.out.println(t);
//		}
		
		System.out.println("-----------");
		
//		int s = 0;
//		for(;s<=10;s++) {//you can write write this way also
//			System.out.println(s);
//		}
		System.out.println("-----------");
		
//		int s = 0;
//		for(;s<=10;) {
//			System.out.println(s);
//			s++;
//		}
		
		System.out.println("-----------");
		
		for(;;) {
			System.out.println("bye");//infinite loop to break infinite loop use break
			break;
		}
		
		System.out.println("-----------");
		
		int t = 0;
		for(;t<=10;) {
			System.out.println(t);
			t++;
			if(t==5) {
				break;
			}
		}
		
		System.out.println("-----------");
		
		for (byte b = 1; b<=10; b++) {
			System.out.println(b);
		}
		
		System.out.println("-----------");
		
		for(double d =1.0; d<=10.0;d++) {
			System.out.println(d);//1.0
			
		}
		
		System.out.println("-----------");
		
		//a to z		
//		for(char c = 'a'; c<='z';c++) {
//			System.out.println(c);
//		}
		
		System.out.println("-----------");
		
		//ascii values
		
		for(char c = 'a'; c<='z'; c++ ) {
			System.out.println(c + ":"+(int)c);
		}
		
		System.out.println("-----------");
		// use cases of for:
				// when number of iterations are fixed:
				// 5 elements --fixed
				// month and days 30/31
		
		// do-while
		//executing the block of code atleast once
		//The Java do-while loop is used to iterate a part of the program several times
		//use cases:
		//1 2 3 4 5 ......10
		
		//1 to 10
		int p = 1;
		do {
//			p++;
			System.out.println(p);
			p++;
		}
		while(p<=10);
		
		System.out.println("--------------");
		
		//10 to 1
		int rowCount = 10;
		while(rowCount>0) {
			System.out.println(rowCount);
			rowCount--;
		}
		// for each
		
	}

}
