import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Rectangles extends JApplet {
	String lengthStr;
	String widthStr;
	Integer length;
	Integer width;
	
	public void init() {
		while (length == null) {
			try {
				lengthStr = JOptionPane.showInputDialog(null, "Enter the length of the rectangle.", "Length", JOptionPane.PLAIN_MESSAGE);
				if (lengthStr == null)
					System.exit(0);
				length = Integer.parseInt(lengthStr);
					
				while (length < 0) {
					JOptionPane.showMessageDialog(null, "INVALID ENTRY!", "ERROR", JOptionPane.ERROR_MESSAGE);
					lengthStr = JOptionPane.showInputDialog(null, "Enter the length of the rectangle.", "Length", JOptionPane.PLAIN_MESSAGE);
					if (lengthStr == null)
						System.exit(0);
					length = Integer.parseInt(lengthStr);	
				}
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "INVALID ENTRY!", "ERROR", JOptionPane.ERROR_MESSAGE);;
				length = null;
			}
		}
		
		while (width == null) {
			try {
				widthStr = JOptionPane.showInputDialog(null, "Enter the width of the rectangle.", "Width", JOptionPane.PLAIN_MESSAGE);
				if (widthStr == null)
					System.exit(0);
				width = Integer.parseInt(widthStr);
					
				while (width < 0) {
					JOptionPane.showMessageDialog(null, "INVALID ENTRY!", "ERROR", JOptionPane.ERROR_MESSAGE);
					widthStr = JOptionPane.showInputDialog(null, "Enter the width of the rectangle.", "Width", JOptionPane.PLAIN_MESSAGE);
					if (widthStr == null)
						System.exit(0);
					width = Integer.parseInt(widthStr);
				}
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "INVALID ENTRY!", "ERROR", JOptionPane.ERROR_MESSAGE);
				width = null;
			}
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawRect(15, 10, width, length);
	}
}
