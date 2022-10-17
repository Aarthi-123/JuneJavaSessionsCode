package junesessions;

public class EcommMethodOverLoading {

	// Method OverLoading: (static)complile time poly(many) + morphism(forms)
	// Method overLoading happen within the same class
	// 1. will have the same name in the method
	// 2.different number of parameters
	// 3.different sequence of parameters
	// 4.return type doesn't matter in the method overloading

	// compiler time polymorphism bcoz when we call the method
	// here the compiler is already decided to which method to call it will show the
	// methods name when we call
	// and also called static polymorphism

//	Advantages of method overloading:
	// user friendly
	// it will avoid the confusion of different method names
	// same method name with different features

	public void test() {// 0 param
		System.out.println("test method");
	}

	public int test(int i) {// 1 param

		return 10 + i;
	}

//	public int test(int y) {//duplicate parameters are not allowed, it will consider only the datatypes and the same sequences of datatype
//							//is not allowed so it will show error. It is same as above method, so it will show error
//	}

	public String test(String k) {// 1 param

		return "aarthi";
	}

	public int test(int p, String k) {// 2 param

		return p + 10;
	}

//	public int test(int d, String n) {// 2 param  //duplicate parameters are not allowed, it will consider only the datatypes and the same sequences of datatype
//									  //is not allowed so it will show error. It is same as above method, so it will show error
//	}

	public void test(String b, int a) {// 2 params

	}

	public void pop() {// this is not method overloading

	}

	// features---business---PO----method
	// examples of method overloading

	public void login() {

	}

	public void login(String username, String password) {

	}

	public void login(String username, String password, int otp) {

	}

	public void login(String username, String password, String role) {

	}

	// amazon
	public void search() {

	}

	public void search(String productName) {

	}

	public void search(String productName, String color) {

	}

	public void search(String productName, String color, int price) {

	}

	// payment:
	public void doPayment(String upi) {

	}

	public void doPayment(String CC, int cvv, int otp) {

	}

	public void doPayment(String paypalId, String pwd) {

	}

	// uber
	public void booking(String stLocation, String endLocation) {

	}

	public void booking(String stLocation, String endLocation, String carType) {

	}

	public void booking(String stLocation, String endLocation, String carType, String couponCode) {

	}

	public static void main(String[] args) {

		// main method in separate position it doesn't store in stack or heap , it is
		// static in nature
		// static never be stored in object
		// if we create any method inside the class , the main method doesn't know where
		// is the method,
		// so we have to create object to call the method

		EcommMethodOverLoading obj = new EcommMethodOverLoading();
		obj.test();

		int sum = obj.test(20);// in here you can see the compile time polymorphism it will show all the test
								// methods
		System.out.println(sum);

		obj.booking("whitefield", "JP nagar", "sedan", "aarthi10");
	}

}
