package junesessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {
		
		//optimal time to run the code--how much time to execute the code
		//BIG O
		
		int i = 1;//particular line how many times it will be executed only one time 
		//O(1)//constant time 
		
		int p = 2;
		int total = i + p;
		System.out.println(total);
		
		//O(N)--->N = 1--->O(1)---constant time..always ignore the constant time bcoz it will take only 1sec
		
		//for loop:
		
		for(int k=0;k<=1000000;k++) {
			System.out.println(k);
		}
		
		//1(k=0)+n(k<=1000000)+n(SOP(k))+n(k++)
		//1+n+n+n--->1+3n--->3n+1----linear equation
		//3n + 1---->3n----> O(n)
		
		//
		
		for(int k=0;k<=10;k++) {
			System.out.println(k);
			System.out.println("hi");
			System.out.println("bye");
		}
		
		//1(k=0)+n(k<=10)+n(SOP(k))+n(SOP(hi))+n(SOP(bye))+n(k++)
		//1+n+n+n+n+n--->1+5n--->5n---O(n)
		
		//two for loops
		
		for(int k = 1; k<=1000000; k++) {
			System.out.println(k);
		}
		
		for(int k = 1; k<=1000000; k++) {
			System.out.println(k);
		}
		
		for(int k = 1; k<=1000000; k++) {
			System.out.println(k);
				if(10==20) {
					System.out.println("bye...");
				}
		}
		//3n + 3n--->6n===>O(n)
		
		//nested loops:
//			for() {
//				for() {
//					for() {
//						
//					}
//				}
//			}

	}

}
