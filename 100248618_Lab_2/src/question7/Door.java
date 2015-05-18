package question7;

import java.awt.Rectangle;

public class Door extends Rectangle {
	private String name;
	private String state;
/**
 * Constructor for the Door object, doorName is passed in to set the name of the door object,
 * doorState is passed in to determine if door is "open" or "closed"
 * 
 * @param doorName initial name of the door
 * @param doorState initial state of the door
 */
	public Door(String doorName, String doorState) {
		name = doorName;
		state = doorState;
	}


	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void open() {
		state = "open";

	}

	public void close() {
		state = "close";
	}

	public String getState() {
		return state;
	}
	
	public boolean isOpen()
	{
		
		if(state == "open")
		{
			return true;
		}
		return false;
		
	}

}
