package SuperKeyword;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		System.out.println(b.minSpeed);

		b.displaySpeed();

		b.getMileage();

//		Testing t = new Testing();//its private method so u cant access
//		
		//which class is already in private?
//		System obj = new System();//system class is already private in nature

		System.out.println(Testing.timeOut);

	}

}
