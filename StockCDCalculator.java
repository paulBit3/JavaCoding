package Projects;

public class StockCDCalculator {

	public static void main(String[] args) {
		// variables
		double saving = 25000;
		double share = 0;
		int stock = 989;
		int remainder = 0;
		
		//calculate share
		share = (int) (saving / stock) ;
		
		//calculate remainder
		remainder = (int) (saving % stock);
        
		//printing share
		System.out.println("Buy " + share + " shares of stock");
		
		//printing remainder
		System.out.println("Invest $" + remainder + " in CD account");
	}
	
	/*
	 * you have $25,000 in savings
	 * The stock price is $989 per share
	 * printing
	 * Buy 25.0 shares of stock
	 * Invest $275 in CD account
	 */

}
