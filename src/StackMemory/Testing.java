package StackMemory;

public class Testing {
	
	public void m1() {
		m2();//here the side blue dot represents debugging process--- for that u have click that m2() method line double click so blue dot will be created
			//then right click run the code as debug as ---then u can see the memory allocation and deallocation
	}
	
	public void m2() {
		m3();//blue dot
	}
	
	public void m3() {
		System.out.println("bye");
		//m1();
	}

	public static void main(String[] args) {
		Testing t = new Testing();
		t.m1();//blue dot
		System.out.println("hello");

	}

}

//so in the stack memory, memory allocation will be taken place while executing the stack
//first main method and then m1 method will stack on the above main... then m2 method will stack on the m1 method...
//then m3 method will stack on the above m2 method
//after allocation the deallocation will takes place one by one m3 to m2 and from m2 to m1 and from m1 to main it will deallocate automatically

//Stack---LIFO---last in first out
//Queue---FIFO---first in first out

//we will think "bye" will print and the code completed, but its not completed again it will deallocate the method one by one
//garbage collector not applicable for stack memory
//heap memory is always complex when compared with stack memory

//How to resolve the stack overflow?
//u can increase the size of the stack
//so u have to avoid in programming itself, proper programming should be maintained




