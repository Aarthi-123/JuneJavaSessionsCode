package assignment;

public class GradeSystem {

	public static void main(String[] args) {
		//if-else-if
		int total = 50;
		
		if(total>=90) {
			System.out.println("Your grade is A");
		}
		else if(total>=80) {
			System.out.println("Your grade is B");
		}
		else if(total>=50) {
			System.out.println("Your grade is C");
		}
		else if(total>=35) {
			System.out.println("Your grade is D ");
		}
		else {
			System.out.println("FAILED");
		}
		
		//nested if
//		int total=95;
//		if(total>=90) {
//			System.out.println("GRADE A+");
//			if(total>=80) {
//				System.out.println("grade A");
//				if(total>=50) {
//					System.out.println("Grade B");
//				}else {
//					System.out.println("FAIL");
//				}
//			}else {
//				System.out.println("70% discount");
//			}
//		}else {
//			System.out.println("100% discount");
//		}
	
		
	}

}
