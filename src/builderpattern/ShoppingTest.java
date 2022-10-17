package builderpattern;

public class ShoppingTest {

	public static void main(String[] args) {

//		Adv:
		// 1.code looks neat and clean
		// 2.you can make different types of chaining also

		// disAdv:
		// inbetween if any public int methodname() came it wont follow the pattern
		// inbetween it will stops

		Ecomm u1 = new Ecomm();
		u1.doLogin("aarthi@gmail.com", "aarthi123")// this is called builder pattern or method chaining
				.search("macbook")
					.addtoCart("macbook pro")
						.makePayment("1232 1212 1212 1212", 123)
							.generateOrder()
								.logout();

		u1.doLogin("aarthi@gmail.com", "aarthi123")
			.addtoCart("iMac")
				.makePayment("1232 1212 1212 1212", 123)
					.generateOrder()
						.logout();

//
		u1.doLogin("dev@gmail.com", "dev123")
			.search("ipad")
				.logout();

//
		u1.doLogin("aarthi@gmail.com", "aarthi123")
			.logout();

//
		u1.doLogin("aarthi@gmail.com", "aarthi123");

//
		u1.doLogin()
			.search("macbook")
				.addtoCart("macbook pro")
					.makePayment("1232 1212 1212 1212", 123)
						.generateOrder()
							.logout();

	}

}
