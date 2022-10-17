package assignment;
import java.util.Arrays;

public class ApplicationArrayListMethodStaticArray {
	// WAF: getDevicesList(empName):
	// param: empName (String)
	// return: list of devices --> ArrayList
	
	

	public  String[] getDeviceList(String empName) {
		System.out.println("getting device list : " + empName);

		if (empName.equalsIgnoreCase("shweta")) {
//			String[] myArray = new  String[3];
			String[] deviceList = new String[3];
			deviceList[0] = "iPhone 12";
			deviceList[1] = "Macbook Pro";
			deviceList[2] = "Airtel SIM";
			
			for (int k = 0; k < deviceList.length; k++) {
				System.out.println(deviceList[k]);
			}
//			myArray = deviceList;
//			System.out.println(myArray);
			return deviceList;

		} else if (empName.equalsIgnoreCase("aarthi")) {
			String deviceList[] = new String[2];

			deviceList[0] = "iPhone 13";
			deviceList[1] = "Macbook air";
			for (int k = 0; k < deviceList.length; k++) {
				System.out.println(deviceList[k]);

			}
			return deviceList;
		} else if (empName.equalsIgnoreCase("prakash")) {
			String deviceList[] = new String[2];

			deviceList[0] = "samsung 10";
			deviceList[1] = "dell laptop";
			for (int k = 0; k < deviceList.length; k++) {
				System.out.println(deviceList[k]);

			}
			return deviceList;

		} else {
			System.out.println("emp name is not found...." + empName);
			return null;
		}

	}

	public static void main(String[] args) {

		ApplicationArrayListMethodStaticArray obj = new ApplicationArrayListMethodStaticArray();

	//	System.out.println(Arrays.toString(ApplicationArrayListMethodStaticArray.getDeviceList("shweta")));
		String[] l1=obj.getDeviceList("shweta");
		System.out.println(Arrays.toString(l1));
		
	}

}
