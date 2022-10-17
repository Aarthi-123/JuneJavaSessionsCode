package assignment;

public class ArrayAssignment {

	public static void main(String[] args) {
		/*Question 1: Write a program to print the following pattern using for loop:


		                        00 01 02 03 04 05 06 07 08 09 
		                        10 11 12 13 14 15 16 17 18 19 
		                        20 21 22 23 24 25 26 27 28 29 
		                        30 31 32 33 34 35 36 37 38 39
		        */

		
		int i[] = new int[4];
		int j[] = new int[9];
		
		for(int i1=0;i1<4;i1++) {
			for(int j1=0;j1<=9;j1++) {
				System.out.println(i1+""+j1+"\t");
			}
		}
		
		System.out.println("------------------");
		/*Question 2: Write a program to create a static Array, having following cricket data:
		                        --name, age, team name, DOB, gender, Strike Rate
		                        --Try to create multiple Object Arrays for different players 
		                        --Try to print all the values of each player on the console*/
		String empName[]  = new String[1];
		empName[0]="Aarthi";
		int empAge[] = new int[1];
		empAge[0]= 25;
		String empTeamName[] = new String[1];
		empTeamName[0]="SuperKings";
		String empDOB[] = new String[1];
		empDOB[0] = "29/05/86";
		char empGender[] = new char[1];
		empGender[0] = 'f';
		double empStrikeRate[] = new double[1];
		empStrikeRate[0] = 100.5;
		
		System.out.println("Name: " + empName[0]);
		System.out.println("Age: " + empAge[0]);
		System.out.println("TeamName: " + empTeamName[0]);
		System.out.println("DOB: " + empDOB[0]);
		System.out.println("Gender: " + empGender[0]);
		System.out.println("StrikeRate: " + empStrikeRate[0]);
		
		System.out.println("------------------");
		
		Object Player1[] = new Object[6];
		Player1[0] = "Aarthi";
		Player1[1] = 25;
		Player1[2] = "SuperKings";
		Player1[3] = "29/5/86";
		Player1[4]='f';
		Player1[5] = 100.8;
		
		Object Player2[] = new Object[6];
		Player2[0] = "Advika";
		Player2[1] = 23;
		Player2[2] = "SuperKings";
		Player2[3] = "15/10/15";
		Player2[4]='f';
		Player2[5] = 100.8;
		
		Object Player3[] = new Object[6];
		Player3[0] = "Akshara";
		Player3[1] = 27;
		Player3[2] = "SuperKings";
		Player3[3] = "25/11/17";
		Player3[4]='f';
		Player3[5] = 100.8;
		
		for(int counter=0;counter<Player1.length;counter++) {
			System.out.println(Player1[counter]);
		}
		
		for(int counter1=0;counter1<Player2.length;counter1++) {
			System.out.println(Player2[counter1]);
		}
		
		for(int counter2=0;counter2<Player3.length;counter2++) {
			System.out.println(Player3[counter2]);
		}
		
		
		System.out.println("------------------");
		
		/*Question 3: Try to print the following pattern on the console:
		                        n = 4
		                        n = 3
		                        n = 2
		                        n = 1
		                        n = 0*/
		
		int n[] = new int[5];
		n[0]=4;
		n[1]=3;
		n[2]=2;
		n[3]=1;
		n[4]=0;
		
		for(int k=0; k<n.length;k++) {
			System.out.println("n = "+ n[k]);
		}
		
		
	}

}
