package question7;

public class DoorTester {
	/**
	 * Tests the methods of the Door class
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		Door frontDoor = new Door("Front", "open");
		System.out.println("The front door is " + frontDoor.getState());
		System.out.println("Expected: open");
		Door backDoor = new Door("Back", "closed");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected: closed");
		// Use the mutator to change the state variable
		backDoor.open();
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected: open");
		// Add code to test the setName mutator here
		backDoor.setName("the door on the back");
		System.out.println("The new back door name is " + backDoor.getName());
		System.out.println("Expected: the door on the back");
	}
}