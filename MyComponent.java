import java.awt.Graphics;


/**
 * @author Leon
 * this is an interface that is used by all classes of type Decorator
 */
public interface MyComponent {

	/**
	 * all classes that use this interface have to implement a method draw which will change the graphic in a unique way
	 * @param g; this parameter is the Graphic that will be changed through the draw method
	 */
	public void draw(Graphics g);
}
