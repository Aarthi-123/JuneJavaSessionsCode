package oop_abstract;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10);//oly thru child class the page parent constructor will call
										 //it will call first Page constructor then Login page constructor
		lp.displayLogo();
		lp.title();
		lp.url();
		lp.resetPwd();
		lp.doLogin("aarthi", "aarthi123");
		
//		Page P = new Page();//NA
		//obj cannot be created for parent abstract class
		//oly thru child class the page constructor will call
		//by default it always go to the parent default constructor
		
		//top casting:
		//child class obj can be referred by abstract parent ref variable
		
		Page p = new LoginPage();
		p.displayLogo();
		p.timeOut();
		p.title();
		p.url();
		
		//down casting:
		//u cannot create obj for abstract parent class so down casting is not possible
	}

}
