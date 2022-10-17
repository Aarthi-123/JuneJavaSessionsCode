package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayListGenericsReverseOrder {

	public static void main(String[] args) {
		
		//reverse  order:
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Aarthi");//0
		empData.add(25);//1
		empData.add(12.33);//2
		empData.add(true);//3
		empData.add('f');//4
		
		System.out.println(empData.size());
		
		for(int i =empData.size()-1; i>=0;i-- ) {
			System.out.println(empData.get(i));
		}
		
		System.out.println("-----------");
		
		/*1. Write a Java program to create a new array list,o
		                 *  add some colors (string) and print out the collection*/
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("Pink");
		colors.add("Black");
		
		for(int j=0;j<colors.size();j++) {
			System.out.println(colors.get(j));
		}
		
		System.out.println("-----------");
		/* 2. Write a Java program to insert
		 *  an element into the array list at the first and last positions.*/
		
		colors.add(0, "Brown");
		colors.add(colors.size(), "White");
		
		for(int j=0;j<colors.size();j++) {
			System.out.println(colors.get(j));
		}
		
		System.out.println("-----------");
		/* 3. Write a Java program to retrieve an element
		 * (at a specified index) from a given array list.
		                 */
		
		System.out.println(colors.get(4));
		System.out.println(colors.get(1));
		
		System.out.println("-----------");
		/* 4. Write a Java program to update specific array element by given element.
		                 * 
		                 */
		colors.set(2,"Green");
		colors.set(5, "Magenta");
		
		for(int j=0;j<colors.size();j++) {
			System.out.println(colors.get(j));
		}
		
		System.out.println("-----------");
		/* 5. Write a Java program to remove the third  element from a array list. 
		                 * 
		                 */
		
		colors.remove(2);
		for(int j=0;j<colors.size();j++) {
			System.out.println(colors.get(j));
		}
		
		System.out.println("-----------");
		/* 6. Write a Java program to search an element in a array list.
		        * 
		        */
		if(colors.contains("Magenta")){
			System.out.println("Magenta is present");
		}else {
			System.out.println("Magenta is not present");
		}
		
		System.out.println("-----------");
		/**
		7. Write a Java program to reverse elements in a array list
		 */
		Collections.reverse(colors);
		for(int j=0;j<colors.size();j++) {
			System.out.println(colors.get(j));
		}
		System.out.println(colors);
		
//		for(int j=colors.size()-1;j>=0;j--) {
//			System.out.println(colors.get(j));
//		}
		
		System.out.println("-----------");
		
		/**
		8. Write a Java program to reverse elements in a array list
		 */
		
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Tom");
		studentNames.add("Peter");
		studentNames.add("Ramya");
		
		for(int k=studentNames.size()-1;k>=0;k--) {
			System.out.println(studentNames.get(k));
		}
		
		Collections.reverse(studentNames);
		System.out.println(studentNames);
		
		System.out.println("-----------");
		/* 9. Write a Java program to extract a portion of a array list.
		                 *         
		                 */
		List<String> list = colors.subList(1, 4);//[White, Magenta, Pink, Orange, Red, Brown]original
		System.out.println(list);//[Magenta, Pink, Orange]
		
		System.out.println("-----------");
		int a = 4;
		int b = 2;
		int c = a+b;
		a = b;
		b = c-a;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-----------");
//		9. Write a Java program of swap two elements in an array list
		Collections.swap(colors, 3, 1);
		System.out.println(colors);//[White, Orange, Pink, Magenta, Red, Brown]
		
		System.out.println("-----------");
		/* 10. Write a Java program to empty an array list.
		                 * 
		                 */
		System.out.println(colors);
//		colors.removeAll(colors);
//		System.out.println(colors);
		
		System.out.println("-----------");
		/* 11. Write a Java program to trim the virtual capacity of an
		                 *  array list the current list size.
		                 * 
		                 * 
		                 */
		colors.trimToSize();
		System.out.println(colors);
		
//		8. Extract a portion:
			String Player[] = {"Dhoni", "Rohit", "Virat", "Dhawan", "Malinga", "Rishab"};
			//To covert static array to dynamic
			ArrayList <String> pr = new ArrayList<String>(Arrays.asList(Player));
			for(int i=2; i<5; i++) {
				System.out.println(pr.get(i));
	}

}
}