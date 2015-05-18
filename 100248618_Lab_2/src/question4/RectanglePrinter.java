package question4;
import java.awt.Rectangle;
/**
* This program creates rectangles, to practice and
* learn how objects work and why do both change at the same time,
* it also uses the grow method to have a better understanding of the
* way the objects are manipulated
* 
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