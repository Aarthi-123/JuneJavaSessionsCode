package Mapping;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
//		<k,v>
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(100, "Tom");
		map.put(200, "Peter");
		map.put(300, "Naveen");
		map.put(400, "Ravi");
		map.put(300, "Aarthi");
		map.put(500, null);
		map.put(null, "Selenium");
		
		System.out.println(map.get(100));
		System.out.println(map.get(500));
		System.out.println(map.get(300));
		System.out.println(map.get(null));
		
//		Map<String, String> empMap = new HashMap<String, String>();//Top Casting it will always arrange on random based order
//		Map<String, String> empMap = new LinkedHashMap<String, String>();//it will always arrange on order based
//		Map<String, String> empMap = new TreeMap<String, String>();//it will always arrange on order based alphabetic
		
//		HashMap<String, String> empMap = new HashMap<String, String>();//it will always based on random based order
		
		Map<String, String> empMap = new LinkedHashMap<String, String>();
		empMap.put("IBM", "Tom");
		empMap.put("Google", "Naveen");
		empMap.put("MS", "Aarthi");
		empMap.put("Amazon", "Peter");
		empMap.put("CTS", "Ravi");
		empMap.put("Infosys", "Ali");
		empMap.put("HCL", "Praveen");
		
		System.out.println(empMap.get("IBM"));
		
		//to print all the values from hashmap:
		
		empMap.forEach((k,v)->System.out.println(k+":"+v));

	}

}
