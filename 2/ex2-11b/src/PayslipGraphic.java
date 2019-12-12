import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class PayslipGraphic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String employeeName = JOptionPane.showInputDialog("Enter employee's name:");
		
		String strHoursWork = JOptionPane.showInputDialog("Enter number of hours worked in a week:");
		int hoursWork = Integer.parseInt(strHoursWork);
		
		String strPayRate = JOptionPane.showInputDialog("Enter hourly pay rate: ");
		double payRate = Double.parseDouble(strPayRate);
		
		String strFedTax = JOptionPane.showInputDialog("Enter federal tax withholding rate:");
		double fedTax = Double.parseDouble(strFedTax);
		
		String strStateTax = JOptionPane.showInputDialog("Enter state tax withholding rate:");
		double stateTax = Double.parseDouble(strStateTax);
		
		double grossPay = payRate * hoursWork;
		double fedWithholding = grossPay * fedTax;
		double stateWithholding = grossPay * stateTax;
		double totalDeduction = fedWithholding + stateWithholding;
		double netPay = grossPay - totalDeduction;
		
		String result = "Employee's Name: " + employeeName 
				+ "\nHours Worked: " + hoursWork
				+ "\nPay Rate: " + payRate
				+ "\nGross Pay: " + grossPay
				+ "\nDeduction: "
				+ "\n Federal Withholding (" + fedTax + "): " + fedWithholding
				+ "\n State Withholding (" + stateTax + "): " + stateWithholding
				+ "\n Total Deduction: " + totalDeduction
				+ "\nNet Pay: " + netPay;
		
		JOptionPane.showMessageDialog(null, result);
	}

}
