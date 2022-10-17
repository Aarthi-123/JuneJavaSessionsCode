package StringManipulation;

public class StringTest {

	public static void main(String[] args) {
		
		String x = "hello selenium ";
//		x.concat("testing");// it will concat and store it in the string constant pool(SCP) but x value "hello selenium" wont change, 
							//when we assign the variable string y it will be saved in the string y as "hello selenium testing" not in x
							//x value is "hello selenium" wont change
		String y =  x.concat("testing");
		System.out.println(x);
		System.out.println(y);
		
		String t1 = "java";//String always create only one object in SCP but ref will be the three t1 and t2 and t3
		String t2 = "java";
		String t3 = "java";
		
		String t4 = new String("selenium");//2 obj---heap + SCP, but in SCP "selenium" string will have no reference
		String t5 = "selenium";//0 obj//already we have "selenium" in SCP without ref, so t5 will automatically will assign the t5 reference to "selenium"
		String t6 ="selenium";//0 obj
		
		t5 = "ruby";//now t5 will be refererred to "ruby", but it wont change the value of "selenium".. 
		System.out.println(t5);
		
		String t7 = new String("selenium");//heap(1 obj)+ SCP(0 obj)
		
		String t8 = "selenium";//SCP(0 obj)
		
		String t9 = new String("automation");//heap(1 obj)+ SCP(1 obj)
		
		String t10 = "automation";//SCP(0 obj)
		
		System.out.println(t10 + "aarthi");//automationaarthi
	}

}

//String always create only one object in SCP but ref will be the two t1 and t2
//when String is created it always create it in the String Constant Pool(SCP) in that only one object will be created when the value is same but ref will be t1 and t2
//String has a special things bcoz it is commonly used datatypes
//duplicate strings are never be allowed
//whenever creating the string literals or objects it will be created inside the String Constant Pool
//whenevr string literals created it will be created in scp
//but String using new keyword object is created, it will create in both heap memory and in SCP(if the same next is not present in the SCP)

//SCP is nothing, it separate space for string inside the heap memory
//garbage collector come inside the heap memory it will delete the no ref and null ref will be deleted... gc will go to SCP very rarely and it will delete the without ref string
//always use .equals while comparing----this method oly will compare the values of the string 
//but "==" it will compare the ref or it will check the memory address 


