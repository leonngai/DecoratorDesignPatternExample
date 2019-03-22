import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * @author Leon
 * this class is a subclass of JPanel and uses the MyComponent interface to draw a string
 */
public class Text extends JPanel implements MyComponent{

	private int x;
	private int y;
	private String text;
	
	public Text(int x, int y, String text) {
		this.x = x;
		this.y = y;
		this.text = text;
	}
	
	public void paintComponent(Graphics g) {
		this.draw(g);
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString(text, x, y);
	}
	
	
}
