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
		
		// Prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		// Prompt the user to enter height in feet
		System.out.print("Enter height in feet: ");
		double feet = input.nextDouble();
		
		// Prompt the user to enter height in inches
		System.out.print("Enter height in inches: ");
		double inch = input.nextDouble();
		
		final double KILOGRAMS_PER_POUNDS = 0.45359237; // Constant
		final double METERS_PER_INCH = 0.0254; // Constant
		final double INCH_PER_FOOD = 12; // Constant
		
		// Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUNDS;
		double heightInMeters = (feet * INCH_PER_FOOD + inch) * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		// Display result
		System.out.println("Your BMI is " + bmi);
		if (bmi < 16) {
			System.out.println("You are seriously underweight.");
		} else if (bmi < 18) {
			System.out.println("You are underweight.");
		} else if (bmi < 24) {
			System.out.println("You are normal weight.");
		} else if (bmi < 29) {
			System.out.println("You are overweight.");
		} else if (bmi < 35) {
			System.out.println("You are seriously overweight.");
		} else {
			System.out.println("You are gravely overweight.");
		}
	}

}
