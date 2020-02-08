package Projects;

import java.util.Scanner;

public class ClassroomRatio {

	public static void main(String[] args) {
		//taking user input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of girls:");
		double x = sc.nextDouble();
		
		System.out.println("Enter the total:");
		double y = sc.nextDouble();
		
		//calculate student's ratio
		int stTeacher = 2;
		double ratio = y / stTeacher;
		
		// calling my percentage function
		percentage(x, y);
		
		//printing student's teacher ratio
		System.out.println("Student-Teacher ratio:" + ratio);
	}
	
	/*
	 * There are 11 boys and 16 girls
	 * 59.259% of the class are girls
	 * student-Teacher ratio is 1
	 * percentage P formula
	 * P=(X * 100) / Y
	 * X = 16 ; Y = Y + X
	 * P= (16 * 100) / 16 + 11
	 * P= 59.259%
	 */
	
	//I created a function to calculate percentage
	public static double percentage(double x, double y) {
		//using float to cast percentage, instead of double 
		double percentage = (float) ((x * 100) / y);
		
		System.out.println("Percentage is" + percentage + "%");
		
		return percentage;	
	}

}
