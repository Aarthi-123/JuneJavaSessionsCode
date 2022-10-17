package assignment;

public class Loops {

	public static void main(String[] args) {
		
//		1. WAP to print following output:
			for(int s = 1;s<=5;s++) {
				System.out.println("I am Batman");
			}
			
//		2. WAP to print following output:
			for(int s1 = 1;s1<10;s1++) {
				System.out.println("I am Batman" + " "+ s1);
			}
			
//		4. Write a program in Java to print "Hello World" ten times using while loop
			int e = 1;
			while(e<=10) {
				System.out.println("Hello World");
				e++;
			}
			
//		5. Write a program in Java to print 1 to 10 using while loop
			int i = 1;
			while(i<=10) {
				System.out.println(i);
				i++;
			}
			
			
			
//		7. print all odd and even numbers between 1 to 100
			
			for(int d=1;d<=100;d++) {
				if(d%2==0) {
					System.out.println("Even numbers : "+ d);
					
				}
				
				for(int d1=1;d1<=100;d1++) {
					if(d1%2 != 0) {
						System.out.println("Odd numbers : "+ d1);
						
					}
				}
				
			
			}
//		8. What will be the output of this program:
//				int i1 = 1;
//				while(i1<=1)
//				System.out.println("Hi Java");//infinite loop
				
//		9. Print A-Z , a-z, 0-9 with the respective ASCII numbers on the console.
				
				for(char c = 'a';c<='z';c++) {
					System.out.println(c + ":"+(int)c);
				}
				
				for(char c1 = 'A';c1<='Z';c1++) {
					System.out.println(c1 + ":"+(int)c1);
				}
				for(char c2 = '0';c2<='9';c2++) {
					System.out.println(c2 + ":"+ (int)c2);
				}
				
//		10. Print this series: 
//				1.0 2.0 3.0  ...... 10.0 
				for(double d5 =1.0f;d5<=10.0f;d5++ ) {
					System.out.println(d5);
				}
				
				System.out.println("-------------");
				
//		11. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
				for(int m =1;m<=10;m++) {
					System.out.println(m);
					if(m%7==0) {
						System.out.println("Bye, see you tomorrow");
						break;
					}
				}
				
//		12. Write a cricket score card system using for and while loops:
				int score = 0;
				while(score<=100) {
					System.out.println(score);
					if(score == 0) {
						System.out.println("Zero - duck");
					}
					if(score == 25) {
						System.out.println("good job");
					}
					if(score == 50) {
						System.out.println("good job - half century");
					}
					if(score == 100) {
						System.out.println("good job - century");
					}
					score++;
				}
				
				for(int sco=0;sco<=100;sco++) {
					System.out.println(sco);
					if(sco == 0) {
						System.out.println("Zero - duck");
					}
					if(sco == 25) {
						System.out.println("good job");
					}
					if(sco == 50) {
						System.out.println("good job - half century");
					}
					if(sco == 100) {
						System.out.println("good job - century");
					}
				}
				

				
				
	}

}
