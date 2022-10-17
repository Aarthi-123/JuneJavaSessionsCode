package assignment;

import java.util.ArrayList;

public class MethodOverLoading {

	public boolean login(String phone, String password) {
		return true;
	}

	public boolean login(String phone, int otp) {
		return true;
	}

//	public boolean login(String username, String password) {
//		return true;
//	}

	public boolean login(String username, String password, int otp) {
		return true;
	}

	public int search(String restaurantName) {
		return 100;
	}

	public ArrayList<String> search(String restaurantName, String foodItem) {

		ArrayList<String> foodLists = new ArrayList<String>();
		foodLists.add(restaurantName);
		foodLists.add(foodItem);

		return foodLists;
	}

	public ArrayList<String> search(String restaurantName, String foodItem, String price) {

		ArrayList<String> foodLists = new ArrayList<String>();
		foodLists.add(restaurantName);
		foodLists.add(foodItem);
		foodLists.add(price);

		return foodLists;
	}

	public ArrayList<String> search(String restaurantName, String foodItem, String price, String rating) {

		ArrayList<String> foodLists = new ArrayList<String>();
		foodLists.add(restaurantName);
		foodLists.add(foodItem);
		foodLists.add(price);
		foodLists.add(rating);

		return foodLists;
	}

	public static void main(String[] args) {

//	1.Consider a food delivery system and try to overload following feaures:
//			feature1 : Login with : all the methods will return boolean (true/false)
//			phone, password
//			phone, otp
//			username, password
//			username, password, otp
		MethodOverLoading fd = new MethodOverLoading();
		boolean b1 = fd.login("98989898", "fd123");
		System.out.println(b1);

		boolean b2 = fd.login("98989898", 123);
		System.out.println(b2);

		boolean b3 = fd.login("aarthi", "fd123", 123);
		System.out.println(b3);

//		feature2: Search a restaurant
//		by restaurant name - return 100
//		by  name and food item - return an Arraylist<String> with restaurant name and food items
//		by name, food item and price - return an Arraylist<String> with restaurant name, food items and price
//		by name, food item, price and rating (1 to 5 star) - return an Arraylist<String> with restaurant name, food items and price
		int i1 = fd.search("Buhari");
		System.out.println(i1);

		ArrayList<String> s1 = fd.search("Mc Donald", "pizza");
		System.out.println(s1);

		ArrayList<String> s2 = fd.search("Mc Donald", "pizza", "120");
		System.out.println(s2);
		
		ArrayList<String> s3 = fd.search("Mc Donald", "pizza", "120", "5 star");
		System.out.println(s3);
	}

}
