package question6;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;

import javax.swing.JComponent;
import javax.swing.JFrame;

import java.awt.geom.Line2D;
/**
* This program creates one triangle using 2D lines and drawing them on a frame.
* <p>
* Oziel Guerra
* 100248618
* May 12 2015
* CPSC 1181
* Lab 2, Part 1
*
*/
public class Triangle {

	/**
	 * 
	 * This method draws the triangle on the frame object.
	 * 
	 * @param g Graphics object
	 */
	public static void draw(Graphics g) {
		//point 1
		final double pointx1 = 250;
		final double pointy1 = 2;
		//point 2
		final double pointx2 = 460;
		final double pointy2 = 450;
		//point 3
		final double pointx3 = 2; 
		final double pointy3 = 450;
		Graphics2D g2 = (Graphics2D) g;
		g2.draw((Shape) new Line2D.Double(pointx1, pointy1, pointx2, pointy2));
		g2.draw((Shape) new Line2D.Double(pointx2, pointy2, pointx3, pointy3));
		g2.draw((Shape) new Line2D.Double(pointx3, pointy3, pointx1, pointy1));

	}

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		
		final int FRAME_WIDTH = 500;
		final int FRAME_HEIGHT = 500;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Triangle");
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
