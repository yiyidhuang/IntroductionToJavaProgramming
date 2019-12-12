import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class Tipping {

	final static double TIP_RATE = 0.15;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double cost = input.nextDouble();
		double gratuity = cost * TIP_RATE;
		
		double subtotal = cost + gratuity;
		
		System.out.println("The gratuity is " + gratuity + " and total is " + subtotal);
	}

}
