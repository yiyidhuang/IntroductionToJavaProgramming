import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class ComputeTax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner
		Scanner input = new Scanner(System.in);
				
		// Prompt the user to enter filling status
		System.out.print(
					"(0-single filer, 1-married jointly, \n)" + 
					"2-married separately, 3-head of household)\n" +
					"Enter the filing status: ");
		int status = input.nextInt();
				
		// Prompt the user to enter taxable income
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
				
		// Compute tax
		double tax = 0;
				
		if (status == 0) { 
			// Compute tax for single filers
			if (income <= 8350) {
				tax = income * 0.10;
			} else if (income <= 33950) {
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			} else if (income <= 82250) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15
					+ (income - 33950) * 0.25;
			} else if (income <= 171550) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15
					+ (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			} else if (income <= 372950) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15
					+ (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
					+ (income - 171550) * 0.33;
			} else {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 
					+ (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
					+ (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
			}
		} else if (status == 1) {
			// Compute tax for married filing jointly
			if (income <= 16700) {
				tax = income * 0.10;
			} else if (income <= 67900) {
				tax = 16700 * 0.10 + (income - 16700) * 0.15;
			} else if (income <= 137050) {
				tax = 16700 * 0.10 + (137050 - 16700) * 0.15 
						+ (income - 137050) * 0.25;
			} else if (income <= 208850) {
				tax = 16700 * 0.10 + (137050 - 16700) * 0.15
						+ (208850 - 137050) * 0.25 
						+ (income - 208850) * 0.28; 
			} else if (income <= 372950) {
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15
						+ (137050 - 67900) * 0.25
						+ (208850 - 137050) * 0.28
						+ (income - 208850) * 0.33;
			} else {
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15
						+ (137050 - 67900) * 0.25
						+ (208850 - 137050) * 0.28
						+ (372950 - 208850) * 0.33
						+ (income - 372950) * 0.35;
			}
		} else if (status == 2) {
			// Compute tax for married filing separately
			if (income <= 8350) {
				tax = income * 0.10;
			} else if (income <= 33950) {
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			} else if (income <= 68525) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15
						+ (income - 33950) * 0.25;
			} else if (income <= 104425) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15
						+ (68525 - 33950) * 0.25
						+ (income - 68525) * 0.38;
			} else if (income <= 186475) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15
						+ (68525 - 33950) * 0.25
						+ (104425 - 68525) * 0.28
						+ (income - 104425) * 0.33;
			} else {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15
						+ (68525 - 33950) * 0.25
						+ (104425 - 68525) * 0.28
						+ (186475 - 104425) * 0.33
						+ (income - 186475) * 0.35;
			}					
		} else if (status == 3) {
			// Compute tax for head of household
					
		} else {
			// Display wrong status
			System.out.println("Error: invalid status");
			System.exit(0);
		}
	}
}
