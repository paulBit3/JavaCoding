package Projects;

import java.util.Arrays;
import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		// Taking user input
		Scanner in = new Scanner(System.in);
				
		System.out.println("Enter the number:");
		int numday = in.nextInt();
		
		//printing days
		System.out.println(dayOfWeek(numday));
		

	}
	
	/*
	 * defining a function that return a string.
	 * I found switch case perfect for this
	 */
	public static String dayOfWeek(int numday) {
		String days ="";
		
		switch (numday){
		case 1:days = "Sunday"; break;
		case 2:days = "Monday"; break;
		case 3:days = "Tuesday"; break;
		case 4:days = "Wednesday"; break;
		case 5:days = "Thursday"; break;
		case 6:days = "Friday"; break;
		case 7:days = "Saturday"; break;
		}
		
		
		/*provision gave me this
		 * -1
         Invalid type	
         -5
        Invalid type
		}*/
		
		if(numday < 0) {
			System.out.print("Invalid type");
		}
		
		return days;
		
	}

	

}
