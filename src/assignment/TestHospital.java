package assignment;

public class TestHospital {

	public static void main(String[] args) {
		
		ApolloInheritance a1 = new ApolloInheritance();
		
		a1.hospital();//override
		a1.numerology();//override
		a1.surgery();//individual
		a1.nerves();//inherit
		
		HospitalInheritance h1 = new HospitalInheritance();
		
		h1.hospital();//individual
		h1.numerology();//individual
		h1.nerves();//individual
		
		//top/up casting 
		
		HospitalInheritance h2 = new ApolloInheritance();
		h2.hospital();//Apollo
		h2.numerology();//Apollo
		h2.nerves();//parenthospital
//		h2.surgery();//there ref type check
		
		//down casting:
		ApolloInheritance a2 = (ApolloInheritance)new HospitalInheritance();//classcast exception
		
	}

}
