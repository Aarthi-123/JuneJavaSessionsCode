package junesessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTests {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(100);
		ar.add(1);
		ar.add(19);
		ar.add(20);
		
		Collections.sort(ar);
		System.out.println(ar);
		System.out.println("min value :" + ar.get(0));
		System.out.println("max value :" + ar.get(ar.size()-1));
		
		Collections.sort(ar, Collections.reverseOrder());
		System.out.println(ar);//it show it like reverse order descending order
		
		int arr[] = {1,2,3,4,5};
//		System.out.println(arr);//it will show the address, for static array it wont show the array values
		System.out.println(Arrays.toString(arr));//Arrays is the default class, toString is the default method, 
												 //for static array you have to use this method to show the array values 
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(2);
		ar1.add(13);
		ar1.add(220);
		ar1.add(119);
		System.out.println(ar1);
		
		ar1.addAll(ar);//merging the two array---- ar1 with ar
		System.out.println(ar1);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Tom");
		names.add("Peter");
		names.add("Lisa");
		names.add("Ravi");
		
		Collections.sort(names, Collections.reverseOrder());
		
		System.out.println(names);
		
		Collections.sort(names);//it will sort according to ascending order
		System.out.println(names);
		
		Collections.swap(names, 1, 2);
		System.out.println(names);
		
		ArrayList<String> emp = new ArrayList<String>();
		emp.add("Tom");
		emp.add("Peter");
		emp.add("Lisa");
		emp.add("Ravi");
		emp.add("Mohit");
		
		System.out.println(emp);
		
//		emp.clear();//it will clear all the array values
//		System.out.println(emp);
		
		if(emp.contains("Peter")) {//it will check the values is present or not, true or false
			System.out.println("peter is present");
		}

	}

}
