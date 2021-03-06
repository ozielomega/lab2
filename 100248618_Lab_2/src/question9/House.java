/**
 * 
 */

package question9;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;

import javax.swing.JComponent;
import javax.swing.JFrame;

import question7.Door;

import java.awt.geom.Line2D;

/**
 * Models a house out of lines and rectangles,
 * uses the Door class to determine if the door of 
 * the house is open or closed, the with that information
 * the door would be either filled or outlined.
 * 
 * @author Oziel Guerra 
 * <p>
 * May 18, 2015
 * CSPC 1181
 *
 */
public class House {

	public House() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method draws the objects necessary to display an abstraction of a house
	 * 
	 * @param g Graphics object
	 */
	public static void draw(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
		// Triangle, roof of house
		// point 1
		final double pointx1 = 150;
		final double pointy1 = 200;
		// point 2
		final double pointx2 = 250;
		final double pointy2 = 100;
		// point 3
		final double pointx3 = 350;
		final double pointy3 = 200;
		g2.draw((Shape) new Line2D.Double(pointx1, pointy1, pointx2, pointy2));
		g2.draw((Shape) new Line2D.Double(pointx2, pointy2, pointx3, pointy3));
		g2.draw((Shape) new Line2D.Double(pointx3, pointy3, pointx1, pointy1));
		// Rectangle that is the body of the house
		Rectangle body = new Rectangle(150, 200, 200, 200);
		g2.draw(body);
		// two rectangles that are the windows of house
		Rectangle window = new Rectangle(175, 225, 50, 50);
		g2.draw(window);
		window.translate(100, 0);
		g2.draw(window);
		// door
		Door houseDoor = new Door("front door", "open");
		Rectangle doorBounds = new Rectangle(225, 300, 50, 100);
		// sets bounds of the door object, bounds are specified by the rectangle doorBounds
		houseDoor.setBounds(doorBounds);
		//sets door to open
		houseDoor.open();
		//checks if houseDoor is open
		if (houseDoor.isOpen()) {
			g2.fill(houseDoor);
		} else {
			g2.draw(houseDoor);
		}
	}

	/**
	 * Sets the frame for the abstraction of the house
	 * @param args not used
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		final int FRAME_WIDTH = 500;
		final int FRAME_HEIGHT = 500;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("House");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent component = new JComponent() {
			public void paintComponent(Graphics graph) {
				draw(graph);
			}
		};
		frame.add(component);
		frame.setVisible(true);

	}

}
