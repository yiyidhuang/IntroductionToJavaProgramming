import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class PoundToKg {

	final static double COEF_POUNDS_KG = 0.454;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		
		double kg = pounds * COEF_POUNDS_KG;
		
		System.out.println(pounds + " pounds is " + kg + " kilograms.");
	}

}
