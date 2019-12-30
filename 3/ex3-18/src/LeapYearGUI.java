import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class LeapYearGUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog(null, 
				"Enter a year",
				"Input Dialog",
				JOptionPane.QUESTION_MESSAGE);
		
		int year = Integer.parseInt(input);
		
		boolean isLeapYear = 
				(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		String output = year + " is a leap year? " + isLeapYear;
		
		JOptionPane.showMessageDialog(null, output);
	}

}
