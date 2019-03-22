import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * @author Leon
 * this is an abstract class that has subclasses of different types of decorators and is a type of JPanel
 */
public abstract class Decorator extends JPanel implements MyComponent{
	MyComponent cmp;
	int x;
	int y;
	int width;
	int height;
	
	public Decorator(MyComponent cmp, int x, int y, int width, int height) {
		this.cmp = cmp;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
}
