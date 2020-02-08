package Projects;

import java.util.Scanner;

public class KioskeChangeCalculator {
	
	public static void main(String[] args) {
		
		// my app name
		System.out.println("*** Claim Academy - Book Store Register ***");
		
		//accepting input from user
		Scanner in = new Scanner(System.in);
		
		System.out.print("Amount Due:");
		double amountOwed = in.nextDouble();
		
		System.out.print("Cash tend:");
		int cashTend = (int) in.nextDouble();
		
		double changeDue = getChange(cashTend, amountOwed);
		//System.out.println("change Due:" +changeDue);
		
	}
	
	/* As I do not know about us changes, I digged a lot which took me a lot hours to resolve the problem
		cashTend is the amount tends by customer
		amount owed is the price of items
		change is the change due to customer
	 * 
	 */
	public static double getChange(int cashTend, double amountOwed) {
		
		//variables 
		double Quarters = .25;
		double Dimes = .10;
		double Nickel = .05;
		double Pennies = .01;
		
		//calculate the change and round it
		double change = ( (double)((int) Math.round((cashTend - amountOwed)*100)) / 100.0);
		
		//calculate the modulus of quarter, dimes, nickels and pennies
		double mdQuarters = ((double)((int) Math.round((change % Quarters)*100)) / 100);
		double mdDimes = ((double)((int) Math.round((mdQuarters % Dimes)*100)) / 100);
		double mdNickel = ((double)((int) Math.round((mdQuarters % Nickel)*100)) / 100);
		double mdPennies = ((double)((int) Math.round((mdQuarters % Pennies)*100)) / 100);
		
		//getting the coins here and casted to int
		int cQuarters = (int) ((change - mdQuarters) / (Quarters));
		int cDimes = (int) ((mdQuarters - mdDimes) / (Dimes));
		int cNickel = (int) ((mdDimes - mdNickel) / (Nickel));
		int cPennies = (int) ((mdNickel - mdPennies) / (Pennies));
		
		//printing out changedue, quarters, dimes, nickel, pennies
		System.out.println("ReturnChange:" +change);
		System.out.println("Quarters:" +cQuarters);
		System.out.println("Dimes:" +cDimes);
		System.out.println("Nickels:" +cNickel);
		System.out.println("Pennies:" +cPennies);
		
		//return value
		return change;
	
	}
	

}
