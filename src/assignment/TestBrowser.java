package assignment;

import java.util.Arrays;

public class TestBrowser {

	public static void main(String[] args) {
		String[] s1 = new String[3];
		s1[0]="BMW";
		s1[1]="Audi";
		s1[2]="Honda";
		
		BrowserConstructor b1 = new BrowserConstructor("chrome",12.55,s1);
			String[] l1 = b1.getPlugin();
			System.out.println(Arrays.toString(l1));
			
			String s3 = b1.getName();
			double s4 = b1.getVersion();
			System.out.println(s3);
			System.out.println(s4);
			
			
			b1.setName("safari");
			b1.setVersion(13.45);
			String s5 = b1.getName();
			double s6 = b1.getVersion();
			System.out.println(s5);
			System.out.println(s6);
			
			String[] s2 = new String[3];
			s2[0]="BMW1";
			s2[1]="Audi1";
			s2[2]="Honda1";
			
			b1.setPlugin(s2);
			String[] l2 = b1.getPlugin();
			System.out.println(Arrays.toString(l2));
			
			b1.changeplugin("Audi2", 1);
			String[] l3 = b1.getPlugin();
			System.out.println(Arrays.toString(l3));
			
			
	}

}
