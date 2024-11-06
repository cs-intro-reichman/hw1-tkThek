// Prints a given number using hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		//Stores the inputted number as a string variable
		String num = args[0];
		String hundreds = "";
		String tens = "";
		String ones = "";

		//Assigns the hundreds, tens, and ones depending on the length of the number
		int numberLength = num.length();
		switch (numberLength) {
			case 1:
				hundreds = "0";
				tens = "0";
				ones = ones + num.charAt(0);
				break;

			case 2:
				hundreds = "0";
				tens = tens + num.charAt(0);
				ones = ones + num.charAt(1);
				break;

			case 3:
				hundreds = hundreds + num.charAt(0);
				tens = tens + num.charAt(1);
				ones = ones + num.charAt(2);
				break;

			default:
				for (int i = 0; i < num.length() - 2; i++) {
					hundreds = hundreds + num.charAt(i);
				}

				tens = tens + num.charAt(num.length() - 2);
				ones = ones + num.charAt(num.length() - 3);
		}

		//Converts the hundreds, tens and ones from String to Integer datatypes.
		int h = Integer.parseInt(hundreds);
		int t = Integer.parseInt(tens);
		int o = Integer.parseInt(ones);

		System.out.println(h + " hundreds, " + t + " tens, and " + o + " ones.");
		}
	}

