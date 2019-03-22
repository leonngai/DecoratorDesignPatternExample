import java.awt.Component;
import javax.swing.*;

/**
 * @author Leon
 * this class has no behaviours or attributes, it is strictly used to run the program
 * in the main method
 */
public class DemoDecoratorPattern {
	
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Learning Decorator Pattern");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyComponent unalteredText = new Text(100, 100, "Hello World!");
		Decorator withDashedBorder = new BorderDecorator(unalteredText, 75, 75, 120, 50);
		Decorator withColourFrame = new ColourFrameDecorator(withDashedBorder, 70, 70, 130, 60);
		Decorator withColouredGlass = new ColourGlassDecorator(withColourFrame, 70, 70, 130, 60);
		
		myFrame.add((Component) withColouredGlass);
		myFrame.setSize(300,200);
		myFrame.setVisible(true);
	}
}
