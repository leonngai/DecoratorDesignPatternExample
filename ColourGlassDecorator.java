import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 * @author Leon
 * this class is a subclass of Decorator and adds a transparent green frame to an existing JPanel
 */
public class ColourGlassDecorator extends Decorator {

	public ColourGlassDecorator(MyComponent cmp, int x, int y, int width, int height) {
		super(cmp, x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		cmp.draw(g);
		Graphics2D g2d = (Graphics2D) g;
		
		Stroke plain = new BasicStroke(3);
	    g2d.setStroke(plain);
	    Color myColor = new Color(0f,1f,0f,.2f);
	    g2d.setColor(myColor);
	    g2d.fillRect(x, y, width, height);
		
	}
	
	public void paintComponent(Graphics g) {
		this.draw(g);
	}

}
