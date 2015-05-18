package question1;

/**
 * this is a re-introduction to string objects
 * this programs has a string named intro, then gets the length of the string. 
 * After that, the string intro is stored in another string called capsIntro,
 * then intro is turned into lower case and print it to the console.
 * 
 * Oziel Guerra
 * 100248618
 * May 12 2015
 * CPSC 1181
 * Lab 2, Part 1
 *
 *
 */

public class ToLowercase {
	public static void main(String[] args) {
		String intro = "When Gregor Samsa "
				+ "woke one morning from uneasy dreams "
				+ "he found himself transformed in his bed "
				+ "into a monstrous verminous insect";
		int n = intro.length();

		String capsIntro = intro.toUpperCase();

		System.out.println("The sentence \"" + intro + "\" is "
				+ intro.length() + " characters long");

		intro = intro.toLowerCase();
		System.out.println(intro);

	}
}

