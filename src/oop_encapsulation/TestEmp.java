package oop_encapsulation;

public class TestEmp {

	public static void main(String[] args) {
//		Employee e1 = new Employee();
//		e1.name;//without getter and setter method(public) you cant access bcoz its private so it will show error thru public u hav to access private
//		e1.setName("Tom");
//		e1.setAge(25);
//		e1.setPerm(true);

		// CRUD

		Employee e1 = new Employee("Tom", 20, true);

		// GET RETRIEVE:
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.isPerm());

		// update / PUT
		e1.setAge(25);

		// GET
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.isPerm());

		e1.setPerm(false);

		// GET
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.isPerm());

	}

}
