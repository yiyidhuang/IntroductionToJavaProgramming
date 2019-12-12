import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CalculateEnergy {

	final static int ENERGY_COEF = 4184;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double weightWater = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initTemperature = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		double energy = weightWater * (finalTemperature - initTemperature) * ENERGY_COEF;
		
		System.out.print("The energy needed is " + energy);
	}

}
