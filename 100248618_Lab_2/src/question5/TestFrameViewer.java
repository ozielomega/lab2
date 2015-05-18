package question5;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class TestFrameViewer {
	public static void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		// your code goes here
	}

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
