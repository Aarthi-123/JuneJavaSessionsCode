package junesessions;

public class AppTest {

	public static void main(String[] args) {
		
		ApplicationSystem app1 = new ApplicationSystem("amazon", 20, "https://www.amazon.com");
		
		int c = app1.getPageCount(app1.name);
		System.out.println(c);
		
		ApplicationSystem app2 = new ApplicationSystem("flipkart", 30, "https://www.flipkart.com" );
		int c1 = app2.getPageCount(app2.name);
		System.out.println(c1);
		
//		app1.sample("advika");
//		app1.sampleprint();

	}

}
