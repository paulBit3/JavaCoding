package Demos;

public class WelcomeMessage {
	public static void main(String[] args) {
		System.out.println("Starting Welcome message");
		
		//Declaring the variable
		String name;
		
		//Define the variable
		name = "Shawn";
		
		
		//Declare & define a variable
		String date = "Friday, 2:12pm";
		double transactionAmount = 32.58;
		char sign = '+';
		
		//use the variable
		System.out.println(name);
		System.out.println(date);
		
		//Print message
		System.out.println("Hi "+ name + ", Welcome back! Your last loding was "+ date +". Your last transaction was for "+ sign +"$" + transactionAmount +".");
	}

}
