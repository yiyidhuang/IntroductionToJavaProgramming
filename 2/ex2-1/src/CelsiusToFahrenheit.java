import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CelsiusToFahrenheit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner 
		Scanner input = new Scanner(System.in);
		
		double celsius = input.nextDouble();
		
		double fahrenheit = (9.0 / 5.0) * celsius + 32;
		
		System.out.println("The fahrenheit is " + fahrenheit);
	}

}
