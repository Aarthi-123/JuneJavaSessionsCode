package assignment;

public class whileAndForLoopNumDecrease {

	public static void main(String[] args) {
		
		//10 to 1
		//for loop
		
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		//10 to 1
		//while loop
		int t = 10;
		while(t>=1) {
			System.out.println(t);
			t--;
		}
		
		//10-1
		//do while
		int p = 10;
		do {
			System.out.println(p);
			p--;
		}
		while(p>=1);

	}

}
