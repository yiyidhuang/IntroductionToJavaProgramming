import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class Payslip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String employeeName = input.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		int hoursWork = input.nextInt();
		
		System.out.print("Enter hourly pay rate: ");
		double rateHourly = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double fedTax = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();
		
		System.out.println("Employee's Name: " + employeeName);
		System.out.println("Hours Worked: " + hoursWork);
		System.out.println("Pay Rate: " + rateHourly);
		
		double amount = rateHourly * hoursWork;
		System.out.println("Gross Pay: " + amount);
		
		System.out.println("Deductions:");
		System.out.println(" Federal Withholding (" + fedTax + "): " + amount * fedTax);
		System.out.println(" State Withholding (" + stateTax + "): " + amount * stateTax);
		System.out.println(" Total Deduction: " + (amount * fedTax + amount * stateTax));
		System.out.println("Net Pay: " + (amount - amount * fedTax - amount * stateTax));
	}

}
