package question5;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JComponent;
/**
* This program creates a frame, with specific width and height.
* <p>
* Oziel Guerra
* 100248618
* May 12 2015
* CPSC 1181
* Lab 2, Part 1
*
*/
public class TestFrameViewer {
	/**
	 * this method draws graphics on the frame
	 * 
	 * @param g graphics object
	 */
	public static void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		// your code goes here
	}
	/**
	 * Sets the frame to be displayed
	 * @param args not used
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		final int FRAME_WIDTH = 250;
		final int FRAME_HEIGHT = 250;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("A Test Frame");
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
