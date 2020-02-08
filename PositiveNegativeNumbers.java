package Projects;

import java.util.Scanner;

public class PositiveNegativeNumbers {

	public static void main(String[] args) {
		// Calling number signe function
		
		//taking user input
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number:");
		int number = in.nextInt();
		
		int numbersigne = numberSigne(number);
		

	}
	
	/*
	 * function to check the number signe.
	 * -1000 we still be Negative even if 1000>0
	 * but -1000<0
	 * Enter number:-2000
       Negative
       Enter number:-1000
       Negative
	 */
	
	private static int numberSigne(int number) {
		
		int compare = 0;
		if (number < compare) {
			System.out.println("Negative");
		}else if (number == 0) {
			System.out.println("Zero");
		}else {
			System.out.println("Positive");
		}
		
		return number;
	}

}
