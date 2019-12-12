import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class ComputeAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user t enter three numbers
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		// Compute average
		double average = (number1 + number2 + number3) / 3;
		
		// Display result
		System.out.println("The average of " + number1 + " " + number2 
				+ " " + number3 + " is " + average);
	}

}
