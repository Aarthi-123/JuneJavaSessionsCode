package junesessions;

public class BrowserNameMethod {
	
	// WAF: launch a browser: FF/ CH/safari
		// param: browser name
		// return: boolean: true/false
	
	public boolean launchBrowser(String brName) {
		System.out.println("launching browser : " + brName);
		
		switch (brName.toLowerCase()){
		case "chrome": {
			System.out.println("chrome is launched");
			return true;
		
		}
		case "firefox": {
			System.out.println("firefox is launched");
			return true;
		
		}
		case "safari": {
			System.out.println("safari is launched");
			return true;
		
		}
		default:
			System.out.println("Plz pass the right browser" + brName);
			return false;
		}
	}
	
	

	public static void main(String[] args) {
		BrowserNameMethod obj = new BrowserNameMethod();
		
		boolean flag = obj.launchBrowser("CHROME");
		System.out.println(flag);
		if(flag) {
			System.out.println("https://wwww.amazon.com");
		}

	}

}
