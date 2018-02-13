
//Name: Kirby Kuznia 
//Title: Assignment 1
//Author: Modified from example in Big Java Books
//Description: Arithmetic operations in Java
//Time Spent: 20 minutes
//Date: 9/1/16

/* a) 3 and 4 are added which adds to 7
	      7 is divided by 5 which is a quotient of 1
	   b) 4 is dived by 5 which is a quotient of 0
	      0 is added to 3 which is a sum of 3
	   c) 3 is printed then incremented to four
	   d) 4 is printed then decremented to three
	   e) 3 plus one which is a sum of 4
	   f) remainder of 17 divided by 5 which is 2
	   g) 17 divided by 5 which is 3
	   h) 3 divided by 17 which is 0
		  17 plus 0 which is a sum of 17
		  17 plus 4 which is a sum of 21
	   i) 17 plus 3 which is a sum of 20
		  17 plus 4 which is a sum of 21
		  20 divided by 21 which is 0
	   j) square root of 4 which is 2
	   k) 3 to the 4th power 
		  3 * 3 * 3 * 3 which is 81   
*/
import java.util.Scanner;

public class Assignment1 {
	private static Scanner in;			//The initialization of the scanner object
	static int jars;					//Using static vars so they can be global variables not required just one style of doing things
	static double gallonsOfMilk;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);			//The scanner class reads the users input
		
		System.out.println("How many gallons of milk do you have? ");
		gallonsOfMilk = in.nextDouble();		//The user will enter the gallons with a decimal point so we use nextDouble to read and save their input
		
		jars = (int) (gallonsOfMilk / .75);		//The calculation is casted to an integer because the user will use whole jars of milk
		
		System.out.print("You need " + jars + " jars for " + gallonsOfMilk + " gallons of milk ");
		
		in.close();		//Stop the scanner object from running
		
		String but = "FaRtS";
		
		System.out.println(but.toLowerCase().equals("farts"));
	}

}






























