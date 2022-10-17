package ExceptionHandling;

public class ThrowsKeyword {
	
	//throws ----it will just throws the exception
	//handling always done by try catch method
	//in the main method u should not throws the exception
	//in the generateOrderId method exception is throwing so we are handling it in doPayment() method
	
	public static void addToCart() {
		System.out.println("adding to cart");
	}
	
	public static void generateOrderId(int num) throws ArithmeticException {
		System.out.println("generate order ID");
		int i = 9/num;
	}
	
	public static void doPayment() {
		System.out.println("do payment");
		
		try {
		generateOrderId(0);
		}
		catch(ArithmeticException e) {
			System.out.println("AE is cmng....");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		addToCart();
		System.out.println("bye");
		
	}

}
