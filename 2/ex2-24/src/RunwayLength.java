import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class RunwayLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v and a: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		double length = (v * v) / (2 * a);
		
		System.out.println("The minimum runway length for this airplane is " + String.format("%.03f", length));
	}

}
