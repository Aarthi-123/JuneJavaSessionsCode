package junesessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		//take a browser value...ch/ff/ie/safari....
		//if the condition is matched...launch the browser
		//else print a mesg: please pass the right browser
		
//		String browser = "chrome";
//		
//		switch (browser) {
//		case "chrome":
//			System.out.println("Launch the chrome");
//			break;
//		case "firefox":
//			System.out.println("launch firefox");
//			break;
//		case "safari":
//			System.out.println("launch safari");
//			break;
//		case "ie":
//			System.out.println("launch ie");
//			break;
//
//		default:
//			System.out.println("please pass the right browser:"+ browser);
//			break;
//		}
		

		
String browser = "chrome";
boolean headless = true;
int timeout = 20;

		switch (browser) {
		case "chrome":
			System.out.println("Launch the chrome");
			if(timeout == 20) {
				System.out.println("Please close the browser");
			}
			if(headless) {
				System.out.println("run the browser in headless mode");
			}
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("please pass the right browser:"+ browser);
			break;
		}
		

		
//		boolean flag = true;
//		double marks = 12.33;
//		switch (marks) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
		//switch case : byte, short, int, long, double, float, char, String 
		
		//switch case not work in  float, double, long, boolean 
		//switch case work in byte, short, int, char, String
		
		//multiple environment: QA/DEV/UAT/STAGE/PROD
		//cross browser logic
		//locator:

	}

}
