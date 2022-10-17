package junesessions;

public class ApplicationSystem {

	// This Application system is calling from AppTest

	String name;
	String samplename;
	int pages;
	String url;

	public ApplicationSystem(String name, int pages, String url) {
		this.name = name;
		this.pages = pages;
		this.url = url;
	}

//	public void sample(String name) {
//		samplename = name ;
//	}
//	
//	public void sampleprint()
//	{
//		System.out.println("samplename..." + samplename);
//	}
	
	public int getPageCount(String appName) {

		switch (appName) {
		case "amazon": {
			//return 10;
			//return pages;
			return this.pages;
		}
		case "flipkart": {
			//return 20;
			//return pages;
			return this.pages;
		}
		case "uber": {
			//return 30;
			//return pages;
			return this.pages;
		}
		default:
			System.out.println("app not found..." + appName);
			return -1;
		}
	}



}
