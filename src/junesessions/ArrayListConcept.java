package junesessions;
import java.util.ArrayList;//always import as the second statement of the package

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//ArrayList--default class--dynamic array you can use different types of datatypes
		//it maintains the index/order internally or automatically
		//new keyword also used to create the object
		//you cannot create the separate class as ArrayList. you can just change the name because it is the default class
		
		//static array size---> .length
		//dynamic array size---> .size
		
		//create the object of ArrayList: with new keyword
	
		ArrayList ar = new ArrayList();//empty arraylist vc=10;pc=0; vc-virtual capacity pc-physical capacity. Arraylist in warning bcoz it is the raw type, bcoz we didn't mention the what type of data it is
		System.out.println(ar.size());//0--->pc=0; nothing is added
		
		ar.add(100);//0
		ar.add(200);//1
		
		
		System.out.println(ar.size());//2
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());//4
		
		ar.add(5000);//4
		ar.add(1600);//5
		
		System.out.println(ar.size());//6
		
		System.out.println(ar.get(0));//100 to fetch the data you have to use .get
//		System.out.println(ar.get(6));//size is above the size so it will show IndexBoundOutException IOB
//		System.out.println(ar.get(-1));//size -1 is the negative value you don't have -1 so it will show IndexBoundOutException IOB
		
		//to print all the values of arraylist: for loop/for each loop:
			
			//
		
			for(int i=0;i<ar.size(); i++) {
				System.out.println(ar.get(i));//100 200 300 400 5000 1600
			}
			
			//How Arraylist is designed how its expand and shrink? 
			//ArrayList ar = new ArrayList();
			//physical capacity --actual size of the value is added
			//when the above line is created it will create the 10 virtual segment and physical segment is 0
			//when first value added 100 that time vc become 9 and pc become 1
			//when the pc reach 10 means pc=10 and then vc become vc=0
			//then you are adding the another value in the arraylist that time pc become pc=11 and vc will add another 5 segment
			//means pc=10/2=5 so vc=5 segment will be added
			//Again 5 values are added in arraylist then the pc become pc=15 and the vc will add another 7 segment
			//means pc=15/2=7 we also call it as load factor
			//virtual segment or virtual capacity it will optimize internally or automatically
			
			//ArrayList ar = new ArrayList(20);
			//in this it mentioned the value inside the bracket as 20
			//so the vc become vc=20 and pc=0
			//if 20 value is added inside the arraylist then the vc will add 10 segment automtically
			//means pc=20/2=10 so vc=10 segment is added automatically
			//another 10 segment filled means pc=30 and vc will add another 15 segment
			//means 30/2=15 so 15 vc segment is created automatically
			
			
			//In this arraylist you can't use the for each loop, bcoz there is no mentioning of what type of data is used
	}

}
