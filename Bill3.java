// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {

		//Stores the name of each diner and the total bill price as string and double variables.
		double billPrice = (double) Integer.valueOf(args[0]);
		String p1 = args[1];
		String p2 = args[2];
		String p3 = args[3];

		//Rounds the divided price for each person
		double forEach = Math.ceil(billPrice/3);

		//Prints the result.
		System.out.println("Pay " + forEach + " Shekels each");

	}
}