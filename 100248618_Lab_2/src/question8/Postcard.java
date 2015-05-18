package question8;

public class Postcard {
	private String message;
	private String sender;
	private String recipient;

	public Postcard(String aSender, String aMessage) {
		message = aMessage;
		sender = aSender;
		recipient = "";
	}
	
	public void setRecipient(String newRecipient)
	{
		recipient = newRecipient;
	}
	
	public void print()
	{
		System.out.println("Dear " + recipient + ",\n" + message + "\n from, \n" + sender);
	}

}
