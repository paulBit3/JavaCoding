package Projects;

import java.util.Scanner;

public class LetterGrade {

	public static void main(String[] args) {
		// Taking user input
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n = in.nextInt();
		
		//calling my void function here
		checkGrade(n);

	}
	
	//let's create a small void function to determine the Grade
	public static void checkGrade(int n) {
		
		//variables
		char grade = 'A';
	
		//for provision, will use a boolean
		boolean isgrade = true;
		
		/*
		 * I believe there's an error in the exercise
		 * A 90 - 100% 
		 * B 80 - 99%  --suppose be 80 -89% unless i'm wrong
		 * C 72 - 79% 
		 * D 64 - 71% 
		 * F 0 - 71%  --suppose be 0 -61% unless i'm wrong
		 */		
		/* we got D[64-71] meant 65 will be a D 
		 * breaking down to 90, 80 , 70 , 60
		 * so we'll get
		 * 65-D
           75-C
           etc...*/
		
		
		//using if statement
		            
		if(n <= 100 && n >= 90) {
			
			grade ='A';
			
		}else if(n >= 80) {
			
			grade ='B';
			
		}else if(n >= 70) {
			
			grade ='C';
			
		}else if(n >= 60) {
			
			grade ='D';
			
		}else if(n <= 59){
			
			grade ='F';
		}
		//checking negative grade
		else if(n == -1) {
			
			System.out.print("No grade");
			
			//I tried all here but still printing F
		}
		
		System.out.print(grade);
	}

}
