import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class WindTemperature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit: ");
		double temperature = input.nextDouble();
		
		System.out.print("Enter the wind speed miles per hour: ");
		double speedWind = input.nextDouble();
		
		double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speedWind, 0.16)
						+ 0.4275 * temperature * Math.pow(speedWind, 0.16);
		
		System.out.print("The wind chill index is " + windChill);
	}

}
