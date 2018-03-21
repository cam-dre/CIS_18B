import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class GradeBook {
	GradeBook() {}
	void displayMessage(double avg) {
		DecimalFormat average = new DecimalFormat("###.##");
		JOptionPane.showMessageDialog(null, "The average of all the score entered is " + average.format(avg) + "!", "Average", JOptionPane.PLAIN_MESSAGE);
	}
}
