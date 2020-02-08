package basics;

public class functions {

	public static void main(String[] args) {
		//call our Hi function
		sayHi();
		
		//call our ptintName function
		printName("Paul" , "Brou");
		
		//call our conbineName function
		String fullname = conbineName("Paul", "Brou");
		System.out.println(fullname);
		
	}
	
	//Hi function
	public static void sayHi() {
		System.out.println("Hi");
	}
	
	//function that print our name
	public static void printName(String firstname, String lastname) {
		System.out.println("Firstname " + firstname);
		System.out.println("Lastname " + lastname);	
	}
	
	//define function that return a fullname
	public static String conbineName(String firstname, String lastname) {
		String conbineName = firstname + " " + lastname;
		return conbineName;
	}

}
