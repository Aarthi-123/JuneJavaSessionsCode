package StringManipulation;

public class CallByReference {
		
	String name;
	int age;
	
	public void getInfo(CallByReference t1) {//always use class name when we send the reference
		t1.name = "Nitin";
		t1.age = 30;
		
		sendMail(t1);
	}
	
	public void getInfo(String nameValue) {//methodoverloading
		System.out.println(nameValue);
	}
	
	public void sendMail(CallByReference t2) {
		t2.name="Peter";
		t2.age=15;
	}
	public static void main(String[] args) {
		
		CallByReference obj = new CallByReference();
		obj.name = "Tom";
		obj.age = 20;
		System.out.println(obj.name + " " + obj.age);
		
		obj.getInfo(obj);//callby reference
		
		System.out.println(obj.name + " " + obj.age);//u will get recent value
		
		obj.getInfo(obj.name);//call by value
		
	

	}

}
