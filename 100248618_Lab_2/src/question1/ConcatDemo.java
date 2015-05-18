package question1;
/**
 * 
 * Oziel Guerra
 * 100248618
 * May 12 2015
 * CPSC 1181
 * Lab 2, Part 1
 *
 */
public class ConcatDemo {
	public static void main(String[] args) {
		String animal1 = "quick brown fox";
		String animal2 = "lazy dog";
		String article = "the";
		String action = "jumps over";
		String message = article + " " + animal1 + " " + action + " " + article
				+ " " + animal2;
		System.out.println(message);
	}
}