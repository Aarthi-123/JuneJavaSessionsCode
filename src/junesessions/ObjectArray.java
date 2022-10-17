package junesessions;

public class ObjectArray {

	public static void main(String[] args) {
		
		//object static array: different types of datatypes can be stored in object array
		//object is a class
		//compiler wont check the memory allocation only in the run time we will get the error(AIOB have to check)
		//size of the object array what are the data added
		//size is fixed
		Object emp[] = new Object[5];
		emp[0] = "Tom";
		emp[1] = 25;
		emp[2] = 12.33;
		emp[3] = 'm';
		emp[4] = true;
//		emp[5] = 989898;
		
		System.out.println(emp[0]);//Tom
//		System.out.println(emp[5]);//AIOB
		
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		
		System.out.println("----------");
		
		for(Object e : emp) {
			System.out.println(e);
			if(e.equals("Tom")) {
				System.out.println("hi....");
				break;
			}
		}
		
		//for each loop does'nt work in decrement and reverse order
		//always work in increment
		//size of the object how much data added
	}

}
