package Projects;

public class TipRecommender {

	public static void main(String[] args) {
		// variables
		double AmountTab = 33.57;
		String Service = "Poor";
		
		//calling my calculateTip function
        calculateTip(AmountTab, Service);
        
        /*
         * printing
         * Your tip: 5.3712 service: Poor
         */
	}
	
	private static double calculateTip(double AmountTab, String Service ) {
		
		//variables
		
		double tabTotalTip = 0;
		
		//declaring tip percent in an array
		double tipPercent[] = new double[3];
		tipPercent[0] = .16;
		tipPercent[1] = .22;
		tipPercent[2] = .26;
		
		int n= tipPercent.length;
		
		//using if statement and for loop to determine whether tip is poor, good or great
		for(int i = 0; i< n; i++)
			if(tipPercent[i] == .16 && Service=="Poor") {
				tabTotalTip = AmountTab * tipPercent[i];
				//System.out.println("Your tip: " + tabTotalTip +  " service: " + Service);
			}else if(tipPercent[i] == .22 && Service=="Good") {
				tabTotalTip = AmountTab * tipPercent[i];
				//System.out.println("Your tip: " + tabTotalTip +  " service: " + Service);
			}else if(tipPercent[i] == .26 && Service=="Great") {
				tabTotalTip = AmountTab * tipPercent[i];
				//System.out.println("tip" + tipPercent[i]);
				//System.out.println("Your tip: " + tabTotalTip +  " service: " + Service);
			}
		
		//print value
		System.out.println("Your tip: " + tabTotalTip +  " service: " + Service);
		return tabTotalTip;
		
	}

}
