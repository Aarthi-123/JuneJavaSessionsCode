package oop_interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();//all the method cmng from fortis hospital
		fh.emergencyServices();
		fh.ENTServices();
		fh.neuroServices();
		
		fh.medicalReasearch();//this is from parent class
		fh.publishMedicalNews();
		
		//top casting 
		//child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();//you cannot access individual method and also UK, Indian Medical methods 
		us.pediaServices();
		us.emergencyServices();//This is from USMedical
		us.OrthoServices();
		us.physioServices();
		
		//Down Casting:
		//FortisHospital fh1 = new USMedical();
		
		//In compile time itself it will show error bcoz interface cannot create an object so down casting is not possible
		
		//to call the variable in interface thru interface name
		System.out.println(USMedical.min_fee);//bcoz the variable is in static and final in default so we are calling thru class name or interface name
		
		//u cant change the variable bcoz its final variable
		
		//to call the interface variable from FortisHospital thru class name 
		System.out.println(FortisHospital.min_fee);
		
		//u cant change the variable thru FortisHospital also, bcoz its final variable
		
		//using interface parent name and also my using child class name also u can call
		USMedical.medicalTraining();
		FortisHospital.medicalTraining();

	}

}
