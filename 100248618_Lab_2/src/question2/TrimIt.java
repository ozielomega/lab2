package question2;

/**
 * This program takes 3 String sentences with spaces and then creates a String "message"
 * that takes the spaces off the other Strings and concatenates them.
 * 
 * Oziel Guerra
 * 100248618
 * May 12 2015
 * CPSC 1181
 * Lab 2, Part 1
 *
 */

public class TrimIt {
	public static void main(String[] args) {
		String sentence1 = "     abc   ";
		String sentence2 = "   def";
		String sentence3 = "ghi        "; 
		String message = sentence1.trim() + sentence2.trim() + sentence3.trim();
		System.out.println(message);
	}
}