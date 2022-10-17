package assignment;

public class EmployeeEncapsulation {
	
	//its calling from TestEmployee
	
	private String name;
	private int age;
	private int salary;
	private boolean isActive;
	private String gender;
	
	//getter and setter:
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void getEmployeeInfo() {
		System.out.println("name: "+ name);
		System.out.println("age: "+ age);
		System.out.println("salary: "+ salary);
		System.out.println("isActive: "+ isActive);
		System.out.println("gender: "+ gender);
	}
	
	

}
