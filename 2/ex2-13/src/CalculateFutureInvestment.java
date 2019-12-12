import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CalculateFutureInvestment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double inventAmount = input.nextDouble();
		
		System.out.print("Enter monthly interest rate: ");
		double monthlyInterest = input.nextDouble();
		
		System.out.print("Enter number of years: ");
		int numOfYears = input.nextInt();
		
		double futureInvestValue = inventAmount * Math.pow((1 + monthlyInterest), (numOfYears * 12));
		
		System.out.printf("Accumulated value is ");
		System.out.printf("%.2f", futureInvestValue);
		System.out.println("");
	}

}
