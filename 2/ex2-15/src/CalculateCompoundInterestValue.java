import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CalculateCompoundInterestValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the deposit monthly: ");
		double fixedDepositMonthly = input.nextDouble();
		
		System.out.print("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 12;
		
		double depositOneMonth = fixedDepositMonthly * (1 + monthlyInterestRate);
		System.out.println("The deposit after the frist month: " + depositOneMonth);
		
		double depositTwoMonth = (fixedDepositMonthly + depositOneMonth) * (1 + monthlyInterestRate);
		System.out.println("The deposit after the second monthes: " + depositTwoMonth);
		
		double depositThreeMonth = (fixedDepositMonthly + depositTwoMonth) * (1 + monthlyInterestRate);
		System.out.println("The deposit after the three monthes: " + depositThreeMonth);
		
		double depositFourMonth = (fixedDepositMonthly + depositThreeMonth) * (1 + monthlyInterestRate);
		System.out.println("The deposit after the four monthes: " + depositFourMonth);
		
		double depositFiveMonth = (fixedDepositMonthly + depositTwoMonth) * (1 + monthlyInterestRate);
		System.out.println("The deposit after the five monthes: " + depositFiveMonth);
		
		double depositSixMonth = (fixedDepositMonthly + depositTwoMonth) * (1 + monthlyInterestRate);
		System.out.println("The deposit after the six monthes: " + depositSixMonth);
	}

}
