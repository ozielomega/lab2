package question4;
import java.awt.Rectangle;
/**
* Oziel Guerra
* 100248618
* May 12 2015
* CPSC 1181
* Lab 2, Part 1
*
*/
public class RectanglePrinter {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(0, 0, 100, 50); 
		Rectangle r2 = r1;
		r2.grow(10,20);
		System.out.println(r1); 
		System.out.println(r2);
	}
}