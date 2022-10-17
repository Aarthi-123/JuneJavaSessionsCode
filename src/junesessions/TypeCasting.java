package junesessions;

public class TypeCasting {

	public static void main(String[] args) {
		//TypeCasting
		//1.Widening TypeCasting
		//conversion of lower datatype into higher datatype Java will do it automatically
		
		byte b = 2;
		short s = b;
		int i = b;
		long l = b;
		
		System.out.println(b);//2
		System.out.println(s);//2
		
		//2.Narrowing
		//conversion of higher to lower data types. Java wont do automatically
		
		int p = 100;
		short s1 = (short)p;
		byte b1 = (byte)p;
		
		System.out.println(s1);//100
		System.out.println(b1);//100
		
		byte m = 110;
		byte n = 114;
		int t1 = m+n;
		byte t = (byte)(m+n);// it will show the wrong answer because it is in out of range. we should always save in those range
		System.out.println(t1);//224
		System.out.println(t);//-32
		
		char c = 97;
		System.out.println(c);//a
		System.out.println(c+'b');//195
		
		

	}

}
