/*
	ISYS 320
	Name(s):Brian Williams
	Date: 4/1/2018
*/


public class P2_BananaStand {
	public static void main(String[] args) {
		String quote = "There's always money in the banana stand.";
		System.out.print(quote.toUpperCase().substring(28, 34));
		lastHalf(quote);
	}
	
	public static String lastHalf(String quote) {
		int middle = quote.length() / 2;
		String newQuote = quote.substring(middle);
//		System.out.print(newQuote);
		return newQuote;

	}
}
