package junesessions;

public class ForEachLoop {

	public static void main(String[] args) {
		
		//for each loop doesn't work in decrement always work in increment
		//for each loop doesn't work in reverse order
		//e is limited to the particular scope , so u can use the same variable 'e'
		//you can use for each loop in double, char, String etc.
		
		
		int i[] = new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		//1.index based for loop
		for(int k = 0;k<i.length;k++) {
			System.out.println(i[k]);
		}
		
		System.out.println("----------");
		
		//2. for each
		for(int e:i) {//e---element(value of array) i---array name 
			System.out.println(e);
		}
		
		System.out.println("----------");
		
		//
		double d[] =  new double[3];
		d[0] = 12.33;
		d[1] = 24.33;
		d[2] = 23.44;
		
		for(double e : d) {
			System.out.println(e);
		}
		
		System.out.println("----------");
		
		//
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = '$';
		
		for(char e: c) {
			System.out.println(e);
		}
	}
	

}
