package junesessions;

import java.util.ArrayList;

public class ApplicationArrayListMethod {
	
	public double getNumber(double d1, double d2) {
		
		double d = d1 + d2;
		return d;
	}
	
	// WAF: getDevicesList(empName):
	// param: empName (String)
	// return: list of devices --> ArrayList
	
	public ArrayList<String> getDeviceList(String empName) {
		System.out.println("getting device list for: " + empName);
		ArrayList<String> deviceLists = new ArrayList<String>();
		
		if(empName.equalsIgnoreCase("shweta")) {
			deviceLists.add("iphone 13");
			deviceLists.add("Macbook Pro");
			deviceLists.add("Airtel SIM");
		}else if(empName.equalsIgnoreCase("aarthi")) {
			deviceLists.add("iphone 12");
			deviceLists.add("Macbook air");
			
		}else if(empName.equalsIgnoreCase("prakash")) {
			deviceLists.add("samsung 10");
			deviceLists.add("Dell laptop");
		}else {
			System.out.println("emp name is not found..." + empName);
		}
		return deviceLists;
	}

	public static void main(String[] args) {
		
		ApplicationArrayListMethod obj = new ApplicationArrayListMethod();
		
		ArrayList<String> l1 = obj.getDeviceList("shweta");
		System.out.println(l1);//to get device lists names
		System.out.println("total devices : " + l1.size());//to get the count of the devices
		
		
		double num = obj.getNumber(1.22, 12.44);
		System.out.println(num);
		

	}

}
