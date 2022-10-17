package StringManipulation;

public class StringCompare {

	public static void main(String[] args) {
		
		String t1 = "java";
		String t2 = "java";
		String n1 = "java";
		
		System.out.println(t1==t2);//true, both are in SCP
		
		String t3 = new String("java");
		
		System.out.println(t1==t3);//false, it will compare the ref(means memory address) not the value so false
		System.out.println(t2==t3);//false
		
		String t4 = new String("java");
		System.out.println(t3==t4);//false
		
		System.out.println(t3.equals(t4));//true, always use .equals it will check the value not the reference
		System.out.println(t1.equals(t2));//true

	}

}
