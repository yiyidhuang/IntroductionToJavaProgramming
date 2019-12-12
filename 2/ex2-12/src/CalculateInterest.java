import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CalculateInterest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balanceOfPayments = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		
		double interest = balanceOfPayments * (annualInterestRate / 1200);
		
		System.out.println("The interest is " + interest);
	}

}
