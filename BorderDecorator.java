import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Stroke;

/**
 * @author Leon
 * this class is a subclass of the Decorator class that adds a dashed border to an existing JPanel
 */
public class BorderDecorator extends Decorator{

	public BorderDecorator(MyComponent cmp, int x, int y, int width, int height) {
		super(cmp, x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		cmp.draw(g);
		Graphics2D g2d = (Graphics2D) g;

      
        Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
        g2d.setStroke(dashed);
        g2d.drawRect(x, y, width, height);
	}
	
	public void paintComponent(Graphics g) {
		this.draw(g);
	}

}
