/**
 * 
 */

import java.util.Scanner;;

/**
 * @author Wei
 *
 */
public class FahrenheitToCelsius {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		// Convert Fahrenheit to Celsius
		double celsius = (5.0 / 9) * (fahrenheit -32);
		System.out.println("Fahrenheit " + fahrenheit + " is " +
						celsius + " is Celsius");
	}

}
