package StringManipulation;

public class StringBuilderVSStringBuffer {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("hello");
		sb.append("selenium");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		
		StringBuffer sb1 = new StringBuffer("hello");
		sb1.append("testing");
		System.out.println(sb1);
		
		String x = "hello";
		x.concat("world");//helloworld
		System.out.println(x);

	}

}

//literals always create in SCP, you cannot change the String value oly gc collector it will be removed, memory wastage will be more
//using Builder and Buffer u can change the value, memory wastage wont be there
//use always builder.... no thread safe, Asynchoronys, faster
//dont use buffer.....Thread safe, synchronised, slower
