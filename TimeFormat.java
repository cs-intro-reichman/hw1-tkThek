// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {

		//Stores the hours and minutes as integer variables (they both come from a single string args[0]).
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		//Defines AM or PM.
		String ampm = "";
		if (hours < 12) {
			ampm = " AM";
		} else {
			ampm = " PM";
		}

		//Converts hours>12 into a 12-hour standard.
		int newHours = 0;
		if (hours > 12) {
			newHours = hours - 12;
		}
		else {newHours = hours;}

		//Prints the result.
		System.out.print(newHours + ":"); System.out.printf("%02d", minutes); System.out.println(ampm);
	}
}