import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 * @author Leon
 * this class is a subclass of Decorator and adds a red frame around an existing JPanel
 */
public class ColourFrameDecorator extends Decorator {

	public ColourFrameDecorator(MyComponent cmp, int x, int y, int width, int height) {
		super(cmp, x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		cmp.draw(g);
		Graphics2D g2d = (Graphics2D) g;
		
		Stroke plain = new BasicStroke(5);
	    g2d.setColor(Color.RED);
	    g2d.setStroke(plain);
	    g2d.drawRect(x, y, width, height);
	}
	
	public void paintComponent(Graphics g) {
		this.draw(g);
	}

	
}
