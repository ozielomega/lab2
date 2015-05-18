package question7;

import java.awt.Rectangle;

public class Door extends Rectangle {
	private String name;
	private String state;

	/**
	 * Constructor for the Door object, doorName is passed in to set the name of
	 * the door object, doorState is passed in to determine if door is "open" or
	 * "closed"
	 * 
	 * @param doorName
	 *            initial name of the door
	 * @param doorState
	 *            initial state of the door
	 */
	public Door(String doorName, String doorState) {
		name = doorName;
		state = doorState;
	}

	/**
	 * This method is a accessor method that returns the name of the specific
	 * Door object that this method is being called with.
	 * 
	 * @return the name of the specific Door object as a String object.
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method is a mutator method that changes the current name of the specific Door 
	 * object to a new one.
	 * 
	 * @param newName new name of the Door object as a String
	 */
	public void setName(String newName) {
		name = newName;
	}
	/**
	 * This Method is a mutator method that does not receive any parameters and changes the 
	 * state of the door to open
	 * 
	 */
	public void open() {
		state = "open";

	}
	/**
	 * This Method is a mutator method that does not receive any parameters and changes the 
	 * state of the door to close
	 * 
	 */
	public void close() {
		state = "close";
	}
	/**
	 * This is an accessor method that gets the state of the door and returns it as a String
	 * @return the state of the door. It can be either open or close, as a String
	 */
	public String getState() {
		return state;
	}

	/**
	 * This method is an accessor method that checks if the door is either open or closed, and returns the result as a boolean. 
	 * <p>
	 * If the door is open, this method returns true, and if the door is closed, it returns false.
	 * @return A boolean. True is state of the door is open and false if the state of the door is close.
	 */
	public boolean isOpen() {

		if (state == "open") {
			return true;
		}
		return false;

	}

}
