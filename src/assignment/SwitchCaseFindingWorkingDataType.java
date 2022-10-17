package assignment;

public class SwitchCaseFindingWorkingDataType {

	public static void main(String[] args) {
		
		
		//Byte is working in switch case
//		byte marks = 50;
//		
//		switch (marks) {
//		case 90:{
//			System.out.println("Your grade is A");
//			break;
//		}
//		case 70:{
//			System.out.println("Your grade is B");
//			break;
//		}
//		case 50:{
//			System.out.println("Your grade is C");
//			break;
//		}
//		case 35:{
//			System.out.println("Your grade is D");
//			break;
//		}
//		default:
//			System.out.println("Failed");
//			break;
//		}
		
		//short is working in switch case
//		
//		short marks = 2022;
//		switch (marks) {
//		case 2000:{
//			System.out.println("your grade is A");
//			break;
//		}
//		case 2022:{
//			System.out.println("Your grade is B");
//			break;
//		}
//		default:
//			System.out.println("Failed");
//			break;
//		}
		
		//int is working in switch case
		
//		int marks = 202236;
//		switch (marks) {
//		case 202236:{
//			System.out.println("your grade is A");
//			break;
//		}
//		case 2022:{
//			System.out.println("Your grade is B");
//			break;
//		}
//		default:
//			System.out.println("Failed");
//			break;
//		}
		
		//long is not working in switch case
	
//		long marks = 2022678989808l;
//		switch (marks) {
//		case 2022678989808l:{
//			System.out.println("your grade is A");
//			break;
//		}
//		case 2022:{
//			System.out.println("Your grade is B");
//			break;
//		}
//		default:
//			System.out.println("Failed");
//			break;
//		}
		
		//double is not working in switch case
		
//		double marks = 12.33;
//		switch (marks) {
//		case 12.33:{
//			System.out.println("your grade is A");
//			break;
//		}
//		case 2022:{
//			System.out.println("Your grade is B");
//			break;
//		}
//		default:
//			System.out.println("Failed");
//			break;
//		}
		
		//float is not working in switch case
		
//		float marks = 12.33f;
//		switch (marks) {
//		case 12.33:{
//			System.out.println("your grade is A");
//			break;
//		}
//		case 2022:{
//			System.out.println("Your grade is B");
//			break;
//		}
//		default:
//			System.out.println("Failed");
//			break;
//		}
		
		//char is working in switch case
		
//		char marks = 'a';
//		switch (marks) {
//		case 'a':{
//			System.out.println("your grade is A");
//			break;
//		}
//		case 'b':{
//			System.out.println("Your grade is B");
//			break;
//		}
//		default:
//			System.out.println("Failed");
//			break;
//		}
		
		//String is working in switch case
		
		String marks = "grade";
		switch (marks) {
		case "grade":{
			System.out.println("your grade is A");
			break;
		}
		case "system":{
			System.out.println("Your grade is B");
			break;
		}
		default:
			System.out.println("Failed");
			break;
		}
		
		//boolean is not working in switch case
		
//		boolean flag = true;
//		switch (flag) {
//		case true:{
//			System.out.println("your grade is A");
//			break;
//		}
//		case false:{
//			System.out.println("Your grade is B");
//			break;
//		}
//		default:
//			System.out.println("Failed");
//			break;
//		}
		
		//Switch case is not working in long, float, double and boolean
		//Switch case is working in byte, short, int, char, String

	}

}
