package junesessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		int i = 20;
		int j = 10;
		
		if(i>=j) {
			System.out.println("both  are equal or i is greater than j");
	
		}
		else {
			System.out.println("both are not equal or i is less than j");
		}
		
		//==, >, <, >=. <=
		
		if(10==20) {//Dead Code---never be executed the code and wrong way of writing code
			System.out.println("hiii");
		}
		else {
			System.out.println("bye");
		}
		
		//
		if(true) {//dont use direct boolean value near "if", always assign it to the particular variable then use it as a codition for "if"
			System.out.println("Selenium");
		}
		else {//Dead Code---never be executed the code and wrong way of writing code
			System.out.println("Cypress");
		}
		
		//
		boolean flag =  true;
		if(flag) {
			System.out.println("Testing with selenium");
		}
		else {
			System.out.println("Testing with cypress");
		}
		//
		//nested if
		int total = 92;
		if (total<=100) {
			System.out.println("PASS");
			if(total>=90) {
				System.out.println("GRADE A");			
//				break;break cannot use it in the if condition
				if(total>=95) {
					System.out.println("100% discount");
				}
				else {
					System.out.println("70% discount");
				}
			}
			else {
				System.out.println("Grade B");
			}
		}
		else {
			System.out.println("Invalid marks");
		}
		
		//
		//take a browser value...ch/ff/ie/safari....
		//if the condition is matched...launch the browser
		//else print a mesg: please pass the right browser
		//because of using this method you will get the performance issue its checking all the "if" condition unnecessarily
		
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("Launch the chrome");
		}
		if(browser.equals("firefox")) {
			System.out.println("Launch the firefox");
		}
		if(browser.equals("ie")) {
			System.out.println("launch the ie....");
		}
		if(browser.equals("safari")) {
			System.out.println("launch the safari....");
		}
		else {
			System.out.println("please pass the right browser....."+ browser);
		}
		
		//if-else-if
		
		//take a browser value...ch/ff/ie/safari....
		//if the condition is matched...launch the browser
		//else print a mesg: please pass the right browser
		//because of using this method you will get the performance issue its checking all the "if" condition unnecessarily
		
		String browserName="opera";
		if (browserName.equals("chrome")) {
			System.out.println("Launch the chrome");
		}
		else if(browserName.equals("firefox")) {
			System.out.println("Launch the firefox");
		}else if(browserName.equals("safari")) {
			System.out.println("launch the safari....");
		}
		else if(browserName.equals("ie")) {
			System.out.println("launch the ie....");
		}
		else {
			System.out.println("please pass the right browser....."+ browserName);
		}
		

	}
	
	

	

}
