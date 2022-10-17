package assignment;

public class TestEmployee {

	public static void main(String[] args) {
		
		EmployeeEncapsulation e1 = new EmployeeEncapsulation();
			e1.setName("aarthi");
			e1.setAge(25);
			e1.setSalary(30000);
			e1.setActive(true);
			e1.setGender("female");
			
			e1.getEmployeeInfo();
	}

}
