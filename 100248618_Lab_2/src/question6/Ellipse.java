package question6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Ellipse {

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
