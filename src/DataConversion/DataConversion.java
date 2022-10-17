package DataConversion;

import java.util.Arrays;

public class DataConversion {

	public static void main(String[] args) {
		
		//1.String to int
		
		String x = "100";
		System.out.println(x+20);//10020
		
		//wrapper class: wrapper class oly work with primitive datatype
		//int---Integer---wrapping the String in Integer
		
		int i = Integer.parseInt(x);//parseInt is used to change the value of String to Integer 
		System.out.println(i+20);//120
		
//		String y = "100A";
//		System.out.println(y+20);
//		int j = Integer.parseInt(y);//NumberFormatException
//		System.out.println(j);

		// 2. String to double:
		String t = "12.33";
		System.out.println(t + 20);

		// double --> Double
		double t1 = Double.parseDouble(t);// 12.33
		System.out.println(t1 + 20);

		// 3. int to String:
		int pop = 100;
		System.out.println(pop + 20);

		int totalBill = pop + 50 - 10;
		System.out.println(totalBill);

		String amount = String.valueOf(totalBill);// "140" valueOf is used to change the value to String
		System.out.println(amount + 10);

		//4. double to String:
		double avg = 12.33;
		String newAvg = String.valueOf(avg);
		System.out.println(newAvg + 1000);

		//5.String to boolean:
		String headless = "false";
		boolean flag = Boolean.parseBoolean(headless);// true

		if (Boolean.parseBoolean(headless)) {
			System.out.println("run in headless mode");
		} else {
			System.out.println("run in normal mode");
		}

		//6. boolean to string:
		boolean test = true;
		String p = String.valueOf(test);
		System.out.println(p + 20);//"test20"

		//7. split:
		String top = "java_python_ruby_dotnet";//java --0 index python--1 index ruby---2 index dotnet---3 index

		String arr[] = top.split("_");//split will always return the output in Array
		System.out.println(arr[0]);
		// System.out.println(arr[4]);//AIOB

		String foo = "xXtestingXxXseleniumxXXautomationXxXjava";//xX will be remove but there is no value so it will be taken as 0 index
		//testingX---1 index, selenium---2 index, XautomationX---3 index, java---4 index.. when removing thing come in first it will taken as 0 index it will be removed and taken with no value
		String f[] = foo.split("xX");//split will always return the output in Array

		System.out.println(f[0]);//no value nothing will be there(no space too)

		System.out.println(f[1]);//testingX

		System.out.println(f[2]);//selenium

		System.out.println(f[3]);//XautomationX

		System.out.println(f[4]);//java

		// System.out.println(f[5]);//AIOB

		String lol = "HelloJavaAutomationJavaTesting";
		String l[] = lol.split("Java");
		System.out.println(Arrays.toString(l));//bcoz its static array so we are using Arrays.toString

		String empData = "Aarthi;sundar;aarthi@gmail.com;aarthi123;jan201990";
		String data[] = empData.split(";");
		for (String e : data) {
			System.out.println(e);
		}

		String lg = "hello selenium java";
		String lk[] = lg.split("\\s+");//always use \\s+ to remove space bcoz it will extra space also
		System.out.println(Arrays.toString(lk));

		char c[] = { 't', 'e', 's', 't' };
		String sc = new String(c);
		System.out.println(sc);
		System.out.println(String.valueOf(c));
	}

}
