import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class WindChill {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit: ");
		double temperature = input.nextDouble();
		
		if (temperature < -58 || temperature > 41) {
			System.out.println("The temperature isn't valid![-58~41]");
			return;
		}
		
		System.out.print("Enter the wind speed miles per hour: ");
		double speedWind = input.nextDouble();
		
		if (speedWind < 2) {
			System.out.println("The wind speed isn't valid![>2]");
			return;
		}
		
		double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speedWind, 0.16)
		+ 0.4275 * temperature * Math.pow(speedWind, 0.16);

		System.out.print("The wind chill index is " + windChill);
	}
}
