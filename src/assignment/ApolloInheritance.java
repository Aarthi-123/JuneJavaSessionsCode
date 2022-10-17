package assignment;

public class ApolloInheritance extends HospitalInheritance {
	
	//its calling from TestHospital
	
	@Override
	public void hospital() {
		System.out.println("Apollo----childhospital");
	}
	
	@Override
	public void numerology() {
		System.out.println("numerology-----Apollohospital");
	}
	
	public void surgery() {
		System.out.println("Apollo------surgery");
	}

}
