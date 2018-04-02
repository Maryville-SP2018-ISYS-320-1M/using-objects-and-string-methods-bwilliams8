/*
	ISYS 320
	Name(s):Brian Williams
	Date: 4/1/2018
*/

public class P5_UpperFirst {

	public static void main(String[] args) {
		String string = "super rainbow";
		String delimiter = " ";
		
		upperFirst(string, delimiter);
		System.out.print(upperFirst(string, delimiter));
	}
	
	public static String upperFirst(String string, String delimiter) {
		String[] halves = string.split(delimiter);
		String firstHalf = halves[0];
		String secondHalf = halves[1];
		String updatedString = firstHalf.toUpperCase() + delimiter + secondHalf;
		
		return(updatedString);
	}

}
