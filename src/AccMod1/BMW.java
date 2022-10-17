package AccMod1;

public class BMW extends Car {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.name = "honda";
		b.price = 20;
//		b.color = "red";//bcoz its private
		b.mileage = 10;
	}

}
//same package on sub class you cant access the private
//u can access---public,protected and default