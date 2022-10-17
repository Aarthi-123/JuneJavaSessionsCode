package assignment;

import java.util.Arrays;

public class BrowsersConstructor {
	
	String name;
	double version;
	String plugin[];
	
	public BrowsersConstructor(String name, double version, String[] plugin) {
		this.name = name;
		this.version = version;
		this.plugin = plugin;
	}

	public static void main(String[] args) {
		
		BrowsersConstructor b= new BrowsersConstructor("Chrome",169.85, new String[]{"xpath","camera","addon"} );
		System.out.println(Arrays.toString(b.plugin));


	}

}
