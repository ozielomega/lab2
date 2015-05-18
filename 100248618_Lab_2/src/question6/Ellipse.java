package question6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.JFrame;
/**
* This program creates 5 ellipses, starting from a diameter of
* 40, being the first ellipse, and ending with a diameter of 200. being the last ellipse.
* This ellipses are created with random colors and all of them have a common point.
* <p>
* Oziel Guerra
* 100248618
* May 12 2015
* CPSC 1181
* Lab 2, Part 1
*
*/
public class Ellipse {

	/**
	 * 
	 * This method draws the ellipses on the frame object.
	 * 
	 * @param g Graphics object
	 */
	public static void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		int maxCircles = 5;
		for (int circleNumber = 0, diameter = 200, x = 100, y = 100; circleNumber < maxCircles; circleNumber++, diameter -= 40, x += 20, y += 40) {

			Ellipse2D.Double circle = new Ellipse2D.Double(x, y, diameter,diameter);
			//create 3 random number variables from 0 to 255 and use the, to create a random color
			int r1 = (int)(Math.random() * 255);
			int r2 = (int)(Math.random() * 255);
			int r3 = (int)(Math.random() * 255);
			Color randomColor = new Color(r1,r2,r3);
			g2.setColor(randomColor);
			g2.fill(circle);
		}

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		final int FRAME_WIDTH = 400;
		final int FRAME_HEIGHT = 400;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Circles");
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
