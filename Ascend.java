// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);

		//When dealing with ranges, always get the magnitude right, then shift it.

		//Get a random number between 0 and 1.
		double randomNumber1 = Math.random();
		double randomNumber2 = Math.random();
		double randomNumber3 = Math.random();

		//Changes the range from 0 to lim and the number's datatype into integer.
		int a = (int) (randomNumber1 * lim);
		int b = (int) (randomNumber2 * lim);
		int c = (int) (randomNumber3 * lim);

		//Finds the smallest and biggest numbers.
		int min = Math.min(Math.min(a, b), c);
		int max = Math.max(Math.max(a, b), c);

		//Finds the middle number.
		int middle = a + b + c - (min + max);

		//Prints the results.
		System.out.print(a + " "); System.out.print(b + " "); System.out.print(c + " ");
		System.out.println(" ");
		System.out.print(min + " "); System.out.print(middle + " "); System.out.print(max + " ");


		//Shifts the range to [1, lim + 1).
		//random = random + 1;

		//Change the range to [1, lim), as changing a variable's type from double to int results
		//in the double rounded down.
		//int result = (int) random;
	}
}
