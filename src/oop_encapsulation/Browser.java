package oop_encapsulation;

public class Browser {
	//its calling From BrowserTest 
	
	//In this thru public method, u can access the private method this is also an encapsulation
	//making public method in same class, u can access the private variables and method
	
	public void launchBrowser() {
		System.out.println("launch the browser");
		checkBrowserVersion();
		checkOSCompatible();
		enoughRAMSpace();
		checkBrowserUpgrade();
	}
	
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}
	
	private void checkOSCompatible() {
		System.out.println("checkOSCompatible");
	}
	
	private void enoughRAMSpace() {
		System.out.println("enoughRAMSpace");
	}
	
	private void checkBrowserUpgrade() {
		System.out.println("enoughRAMSpace");
	}

}
