package basics;

public class Numbers {
	
	public static void main(String[] args) {
		int numA = 5;
		int numB = 6;
		int numberOfElements = 2;
		
		//Add together to get sum
		int sum = numA + numB;
		System.out.println(sum);
		
		//Divide by 2
		System.out.println(sum / numberOfElements); //5
		
		//Solution1: modify our divisor by double
		System.out.println(sum / numberOfElements); //5.5
		
		//Solution 2: "CAST" our number to a double
		//double average(numA+numB)/2; //5
		double average = ((double)(numA+numB))/numberOfElements;
		System.out.println(average);
		
	}

}
