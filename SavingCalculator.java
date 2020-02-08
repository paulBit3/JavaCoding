package Projects;


/*
 * Savings Calculator project
 * 
 * */

public class SavingCalculator {

	public static void main(String[] args) {
		// calling futureValue
		
		int presentValue = 20000;
		int time = 15;
		double rate = 4.5;
		int FValue = futureValue(presentValue, rate, time);
		
		/*
		 * printing
		 * Your Future Value is:33500
		 */

	}
	
	//savings calculator
	private static int futureValue(int PV, double r, int t) {
		
		//define variables
		
		double rate = r/100;
		
		//casting value to int
		int FV = (int)(PV*(1+(rate*t)));
		
		//printing out value
		System.out.println("Your Future Value is:" + FV);
		
		//my return value
		return FV;
		
	}

}
