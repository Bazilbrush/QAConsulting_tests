package qa_calculator;

import java.util.Scanner;

public class user_input {
	
	public static int n; //declare
	public static int x;
	public static int y;
	public static int z;
	
	//Constructor-------------------------------------------------------------
	public user_input(int Stand, int Pensioner, int Student, int Child) {
		n = Stand;
		x = Pensioner;
		y = Student;
		z = Child;
		
	}
	
	public void input_Data_Standard(){
	
 	Scanner reader = new Scanner(System.in);  // Reading from System.in
 	System.out.println("How many Standard tickets?: ");
 	int n = reader.nextInt(); 
 	user_input.n = n;
 	
 	}
 	
	public void input_Data_Pensioner(){
 	Scanner reader1 = new Scanner(System.in);  // Reading from System.in
 	System.out.println("How many pensioner tickets?: ");
 	int x = reader1.nextInt();
 	user_input.x = x;
	}
	
	public void input_Data_Student(){
 	Scanner reader2 = new Scanner(System.in);  // Reading from System.in
 	System.out.println("How many Student tickets?: ");
 	int y = reader2.nextInt();
 	user_input.y = y;
	}
	
	public void input_Data_Child(){
 	Scanner reader3 = new Scanner(System.in);  // Reading from System.in
 	System.out.println("How many Child tickets?: ");
 	int z = reader3.nextInt();
 	user_input.z = z;
 	
	}
 	
 	
 	
}
