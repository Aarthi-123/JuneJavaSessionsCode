package junesessions;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//arrays:
		//limitations of array:
		//1.similar type of data only, different data types can't be used: to overcome to this, we have to use dynamic array: ArrayList or can use Object Array
		//2.size is fixed: static array: to overcome this issue, we have to use dynamic array: ArrayList
		
		//1.int array:
		
		
		//a.using new keyword: new keyword is used to allocate the memory location for the values and also without aware of how many values in an array
		int i[]  = new int [4];//[4] represents the length of an array, you can also write int []i
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		
//		System.out.println(i[4]);//ArrayIndexOutOfBoundException---out of length means it will show exception AIOB
//		System.out.println(i[-1]);//ArrayIndexOutOfBoundException---out of length means it will show exception
		
		System.out.println(i.length);
		int len = i.length;//4
		int li = 0;
		int hi = len -1;
		
		System.out.println("li ="+ li);
		System.out.println("hi ="+ hi);
		System.out.println("length ="+ len);
		
		System.out.println("-------------");
		
		//to print all the values from array: iterate this array: for loop
		for(int k =0;k<i.length;k++) {// here k represents the index
			System.out.println(i[k]);
		}
		
		System.out.println("-------------");
		
		//to print the reverse order:
		for(int p=i.length-1;p>=0;p--) {
			System.out.println(i[p]);
		}
		
		System.out.println(i[0]+i[1]);
		
		
		//2.double:
		double d[] = new double[2];//0-1
		d[0]=12.33;
		d[1]=23.44;
		System.out.println(d[0]);
		
		System.out.println("-------------");
		
		
		//3.char:
		
		char c[] = new char[3];//0-2
		c[0] = 'a';
		c[1] = 'b';
		c[2] = '$';
		
		System.out.println(c[0]+c[1]);//195
		
		for(int g=0;g<c.length;g++) {
			System.out.println(c[g]);//a b $
		}
		
		System.out.println("-------------");
		
		int k[] = new int[5];
		System.out.println(k[0]);//o/p: 0 default value
		System.out.println(k[4]);//o/p: 0 default value
//		System.out.println(k[6]);//ArrayIndexOutOfBoundException---out of length means it will show exception AIOB
		
		char c1[] = new char[4];
		System.out.println(c1[0]);//o/p: empty space will be the value
//		System.out.println(c1[5]);//ArrayIndexOutOfBoundException---out of length means it will show exception AIOB
		
//		using of static array, size is fixed:
//		eg.month array
//		   day array(30 or 31)
//		   flight booking(max seat 180)
//		   movie tickets(seats)
//		   6 balls per over
		   
	}

}
