package Demos;

public class SalaryCalculator {

	public static void main(String[] args) {
		// annual salary: hourly rate * hours in work * weeks in year
		
		//Define variables
		double hourlyRate = 37;
		int hourlyInWeek = 40;
		int vacationWeek = 3;
		int weeksInYear = 52;
		
		//perform calculation
		int workingsWeeks = weeksInYear - vacationWeek;
		double annualIncome = hourlyRate * hourlyInWeek * workingsWeeks;
		
		
		//Print result
		System.out.println("$" + annualIncome);

	}

}
