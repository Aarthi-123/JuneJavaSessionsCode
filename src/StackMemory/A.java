package StackMemory;

public class A {

	public static void main(String[] args) {

		System.out.println("A -- main");
		B.main(args);
	}
}

//from A class when it calls B.main(args) and from B class it calls again A.main(args) so there will be a infinite calling taking place
//so inside the stack memory the memory allocation will be done for each method like a.main then b.main again a.main and b.main like that
//after that it ther will be no space will be available bcoz its infinite calling so it becomes overflow 
//so we will get the stackoverflow error
//this is applicable for all the methods not oly for main method

//This is also called calling or execution stack