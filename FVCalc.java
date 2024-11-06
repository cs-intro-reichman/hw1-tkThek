// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		//Assigns the values to be inputted to variables
		int currentValue = Integer.valueOf(args[0]);
		double rate = Double.valueOf(args[1]);
		int n = Integer.valueOf(args[2]);

		//Calculates the future value based on the formula
		int futureValue = (int) (currentValue * Math.pow((1 + (rate/100)), n));

		System.out.println("After " + n + " years, $" + currentValue + " saved at "
							+ rate + "% will yield $" + futureValue);
	}
}