// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {

		//Stores the name of each diner and the total bill price as string and double variables.
		double billPrice = (double) Integer.valueOf(args[3]);
		String p1 = args[0];
		String p2 = args[1];
		String p3 = args[2];

		//Rounds the divided price for each person
		double forEach = Math.ceil(billPrice/3);

		//Prints the result.
		System.out.println("Dear " + p3 + ", " + p2 + ", and " + p1 +
				": " + "pay " + forEach + " Shekels each");

		//Dear c, b, and a: pay 80.0 Shekels each
	}
}