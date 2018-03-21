import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Rectangles extends JApplet {
	String lengthStr;
	String widthStr;
	String xStr;
	String yStr;
	Integer length;
	Integer width;
	Integer xPos;
	Integer yPos;
	
	public void init() {
		while (xPos == null) {
			try {
				xStr = JOptionPane.showInputDialog(null, "Enter the starting x position of the rectangle.", "X Position", JOptionPane.PLAIN_MESSAGE);
				if (xStr == null)
					System.exit(0);
				xPos = Integer.parseInt(xStr);
					
				while (xPos < 0) {
					JOptionPane.showMessageDialog(null, "INVALID ENTRY!", "ERROR", JOptionPane.ERROR_MESSAGE);
					xStr = JOptionPane.showInputDialog(null, "Enter the starting x position of the rectangle.", "X Position", JOptionPane.PLAIN_MESSAGE);
					if (xStr == null)
						System.exit(0);
					xPos = Integer.parseInt(xStr);	
				}
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "INVALID ENTRY!", "ERROR", JOptionPane.ERROR_MESSAGE);;
				xPos = null;
			}
		}	
		while (yPos == null) {
			try {
				yStr = JOptionPane.showInputDialog(null, "Enter the starting y position of the rectangle.", "Y Position", JOptionPane.PLAIN_MESSAGE);
				if (yStr == null)
					System.exit(0);
				yPos = Integer.parseInt(yStr);
					
				while (yPos < 0) {
					JOptionPane.showMessageDialog(null, "INVALID ENTRY!", "ERROR", JOptionPane.ERROR_MESSAGE);
					yStr = JOptionPane.showInputDialog(null, "Enter the starting y position of the rectangle.", "Y Position", JOptionPane.PLAIN_MESSAGE);
					if (yStr == null)
						System.exit(0);
					yPos = Integer.parseInt(yStr);	
				}
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "INVALID ENTRY!", "ERROR", JOptionPane.ERROR_MESSAGE);;
				yPos = null;
			}
		}
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
		
		g.drawRect(xPos,yPos, width, length);
	}
}