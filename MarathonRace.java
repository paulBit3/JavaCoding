package Projects;

public class MarathonRace {

	public static void main(String[] args) {
		// variables
		
		int hh = 0;
		int mn = 0;
		int ss = 0;

		int totalSecond = 7724;
		
		/*
		 * we know 1h = 3600s -->>>7724s?
		 */
		//calculate race hour
		int findhh = totalSecond / 3600;
		
		//calculate minute
		mn = (totalSecond % 3600) / 60;
		
		//calculate second
		ss = totalSecond % 60;
		
		//printing race time in hours, minutes , seconds
		System.out.println(+findhh + "hrs:" +mn + "mn:" +ss+ "secs");
		
		//calculate the average pace
		double race = 26.2;
		double averpace= (totalSecond / 60) / race;
		
		//printing average pace
		System.out.print("Average pace: " + averpace + "  minutes per mile");

	}

}
