package Projects;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		//taking user input
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int n = in.nextInt();
		
		// calling my void function here
		
        number(n);

	}
	
	/* I will create a small void function to do the work 
	 * 5
     Odd
     6
     Even
     242
     Even*/
	
	private static void number(int mynumber) {
		// I will use modulus to get the remainder
		if (mynumber % 2 == 0 ) {
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
		
		
	}
	
	//an other way but it's the same
//	private static void number(int mynumber) {
//		// I will use modulus to get the remainder
//		if (mynumber % 2 == 0 ) {
//			System.out.println("Even");
//		}else if(mynumber % 2 != 0){
//			System.out.println("Odd");
//		}
//		
//		
//	}

}
