import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CalculateBMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in kilograms: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter height in metres: ");
		double height = input.nextDouble();
		
		double bmi = weight / Math.pow(height, 2);
		
		System.out.println("BMI is " + bmi);
	}

}
