package WebDriver_Arch;

public class AmazonPageTest {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
				// chrome
				// firefox
				// safari

				// ChromeDriver driver = new ChromeDriver();//for each time u cant create separate obj instead os that u can use top casting
				// FirefoxDriver driver = new FirefoxDriver();
				// SafariDriver driver = new SafariDriver();
		
		String browser = "ie";//if browser is wrong means browser is "ie" it will take the default value of null.. so it displays nullpointerexception
							  //so automatically driver become null 
		
		switch (browser) {
		case "chrome": {
			driver = new ChromeDriver();
			break;
		}
		case "firefox":{
			driver = new FireFoxDriver();
			break;
		}
		case "safari":{
			driver = new SafariDriver();
			break;
		}
		default:
			System.out.println("pls pass the right browser: "+ browser);
			break;
		}
		
		//WebDriver driver = new ChromeDriver();//top casting
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.sendKeys("EmailID", "aarthi@gmail.com");
		driver.sendKeys("Password", "aarthi123");
		driver.click("loginBtn");

		driver.close();
	}

}
//web driver is a concept it should in interface... webdriver cannot take business logic
//it is the responsibility to get title etc....so it is the browser(chrome, firefox, safari) responsibility....
//so in this case we have to use the interface
