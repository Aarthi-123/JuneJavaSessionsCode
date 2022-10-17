package junesessions;

public class DataTypesConcept {
	/**
	 * 
	 * @author aarthi
	 */

	public static void main(String[] args) {
		
		//data types:
		//strict data type
		//1. primitive data types: can be used directly inside the memory
		//no need to create any object
			//a. Boolean type: boolean (true/false)
			//b. Numeric type:
				//b.1 character type: char
				//b.2 Integral type:
					//b.2.1 Integer: byte, short, int, long
					//b.2.2 Floating-point: float, double
		
		
		
		
		//2. non primitive data types: class, string, array, interface, Abs class
		//you need to create object
		
		//1.byte:
		//size:1 byte 1byte = 8 bits
		//range:-128 to 127
		//2^8 
			byte b = 1;
				b=10;
				 System.out.println(b);
			byte b1 = -10;
			//byte b2 = 200; way out of range it will show error
			
		//2. short:
		//size: 2 bytes = 2 x 8 = 16 bits
		//range:-32768 to 32767
			short s = 10000;
			System.out.println(s);
			//short s1 = 1; should not waste the memory instead of that use byte because it takes 1 byte= 8 bits
			short s1 = 1;
			System.out.println(s1);
		
		//3.int:
		//size: 4 bytes = 4 x 8 =32 bits
		//range:-2147483648 to 2147483647
		//-2^32 to 2^32-1
			int i = 12121212;
			int p = 1;
			int e = 10;
			System.out.println(i);
			System.out.println(p);
			System.out.println(p+e);//11
			
		//4.long:
		//size: 8 bytes = 8 x 8 = 64 bits
		//range:-2^64 to 2^64-1
			
			long num = 8888383883L;
			long l1 = 3753757587l;
			long dist = 10;
			System.out.println(l1);
			System.out.println(num);
			System.out.println(dist);
			
		//5.floating-point:
		//size: 4 bytes = 4 x 8 =32 bits
			float f = 12.33f;
			float f1 = (float)3.44;
			System.out.println(f);
			System.out.println(f1);
			float f2 = 100;
			System.out.println(f2);//100.0
			
		//6.double:
		//size:8 bytes = 8 x 8 = 64bits
			double d = 12.3333;
			double d1 = -123.444;
			System.out.println(d);
			System.out.println(d1);
			double d2 = 23.44;
			double d3 = 10.1;
			System.out.println(d2+d3);
			
		//7.char:
		//size: 2 bytes = 2 x 8 = 16 bits
			char c = 'a';//97
			char c11 = 'b';//98
			char c1 = '1';
			char c2='$';
			System.out.println(c);//a 
			System.out.println(c1);//1
			System.out.println(c+c11);//97 + 98 only doing the arithmetic operation it will consider the ascii values 195
			System.out.println(c-c11);
			System.out.println(c*c11);
			char t = '4';
			char t1 = '0';
			char g = 97;
			System.out.println(g);//a
			System.out.println(t+t1);
			System.out.println(t1);
			
		//range:
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
			
			System.out.println((byte)c);//97
			System.out.println((int)'b');//98
			System.out.println((short)c);//97
			System.out.println((long)c);//97
			System.out.println((float)c);//97.0
			System.out.println((double)c);//97.0
			
			char gender = 'm';
			char currency = '$';//unicode also 2 bytes
			
		//8.boolean: true/false
		//size:~1 bit
			boolean bl = true;
			boolean bl1 = false;
			
			System.out.println(bl);
			System.out.println(bl1);
			
			boolean flag = true;
			System.out.println(flag);
			
			
					

	}

}
