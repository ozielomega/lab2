package question8;
/**
 * This program constructs a postcard using the Postcard class
 * @author Oziel Guerra
 *
 */
public class PostcardPrinter {
	/**
	 * Builds the postcard sending a message, a recipient and a sender to the Postcard class
	 * @param args not used
	 */
	public static void main(String[] args) {
		String text = "I am having a great time on\nthe island of Java. "
				+ "Weather\nis great. Wish you were here!";
		Postcard postcard = new Postcard("Janice", text);
		postcard.setRecipient("Sue");
		postcard.print();
		postcard.setRecipient("Tim");
		postcard.print();
	}
}