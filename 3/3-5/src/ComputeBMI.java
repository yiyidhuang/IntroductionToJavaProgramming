import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class ComputeBMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Prompt the user the enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		// Prompt the user the enter height in inches
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
		final double METERS_PER_INCH = 0.0254; // Constant
		
		// Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		// Display result
		System.out.println("Your BMI is " + bmi);
		
		if (bmi < 16)
			System.out.println("You are seriously underweight");
		else if (bmi < 18)
			System.out.println("You are underwight");
		else if (bmi < 24)
			System.out.println("You are normal weight");
		else if (bmi < 29)
			System.out.println("You are overweight");
		else if (bmi < 35)
			System.out.println("You are seriously overweight");
		else
			System.out.println("You are gravely overweight");
	}

}
