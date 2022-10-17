package oop_multipleinheritance;

public class Page extends Web {
	
	//its calling from PageTest
	
	@Override
	public void getColor() {
		System.out.println("Page-----Red color");
	}
	
	public void getPageLoadTimeOut() {
		System.out.println("page -- 20 secs");
	}

}
