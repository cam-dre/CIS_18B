import javax.swing.JOptionPane;

public class GradeClient {
	public static void main(String[] args) {
		int size;
		double[] grades;
		double total = 0.0;
		double avg;
		String sizeStr;
		String gradeStr;
		
		GradeBook gradeBook = new GradeBook();
		
		sizeStr = JOptionPane.showInputDialog(null, "How many grades do you want to enter?", "Number of Grades", JOptionPane.QUESTION_MESSAGE);
		size = Integer.parseInt(sizeStr);
		
		while (size < 0) {
			JOptionPane.showMessageDialog(null, "INVALID ENTRY!", "ERROR", JOptionPane.ERROR_MESSAGE);
			sizeStr = JOptionPane.showInputDialog(null, "How many grades do you want to enter?", "Number of Grades", JOptionPane.QUESTION_MESSAGE);
			size = Integer.parseInt(sizeStr);
		}
		
		grades = new double[size];
		
		for (int i = 0; i < size; i++) {
			gradeStr = JOptionPane.showInputDialog(null, "Plese enter grade #" + (i + 1) + ". (Number should be between 0 and 100)", "Grade Input", JOptionPane.PLAIN_MESSAGE);
			grades[i] = Double.parseDouble(gradeStr);
			
			while (grades[i] < 0 || grades[i] > 100) {
				JOptionPane.showMessageDialog(null, "INVALID ENTRY!", "ERROR", JOptionPane.ERROR_MESSAGE);
				gradeStr = JOptionPane.showInputDialog(null, "Plese enter grade #" + (i + 1) + ". (Number should be between 0 and 100)", "Grade Input", JOptionPane.PLAIN_MESSAGE);
				grades[i] = Double.parseDouble(gradeStr);
			}
			total += grades[i];
		}
		avg = total / size;
		
		gradeBook.displayMessage(avg);
	}
}
