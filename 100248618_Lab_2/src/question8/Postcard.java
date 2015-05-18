package question8;
/**
 * Template for a basic postcard.
 * 
 * The postcard contains a message, a sender, and a recipient, all String objects.
 * 
 * @author Oziel Guerra 
 *
 */
public class Postcard {
	private String message;
	private String sender;
	private String recipient;

	/**
	 * Postcard constructor. starts building a postcard with a sender and a message
	 * @param aSender sender as a String object
	 * @param aMessage message as a String object
	 */
	public Postcard(String aSender, String aMessage) {
		message = aMessage;
		sender = aSender;
		recipient = "";
	}
	/**
	 * This is a mutator method that changes the recipient of the current postcard object
	 * @param newRecipient name of recipient as an object
	 */
	public void setRecipient(String newRecipient)
	{
		recipient = newRecipient;
	}
	
	/**
	 * This is an accessor method that prints the postard to the console with the recipient,
	 * message and sender.
	 */
	public void print()
	{
		System.out.println("Dear " + recipient + ",\n" + message + "\n from, \n" + sender);
	}

}
