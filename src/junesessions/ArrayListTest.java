package junesessions;

import java.util.ArrayList;//ctrl+shift+o

public class ArrayListTest {

	public static void main(String[] args) {
		
		//without mentioning the type of data it will show warning in ArrayList, bcoz it is the raw type
		//so we have to use ArrayList with Generics method--means we have to mention the type of data
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		System.out.println(marksList.size());//0
		
		marksList.add(100);//0
		marksList.add(200);//1
		marksList.add(11);//2
		marksList.add(20);//3
		
		System.out.println(marksList.get(0));//100
		
		System.out.println(marksList.get(1));//200
		
		marksList.remove(2);
		
		System.out.println(marksList.get(2));//20
		
		marksList.add(400);//3
		
		System.out.println(marksList.get(3));//400
		
		marksList.add(0, 150);//replacing the 0 index value 100 with 150
		System.out.println(marksList.get(0));//150
		
//		marksList.add(7, 1000);//there is no 7th index without filling 5th and 6th index you can't bypass the index 5th and 6th you cant add the 7th index value
//		System.out.println(marksList.get(7));//so it will show IOB
		
		for(int i=0; i<marksList.size();i++) {
			System.out.println(i + ":" +marksList.get(i));
		}
		

	}

}
