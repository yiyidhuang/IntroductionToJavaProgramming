import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class VerifyTriangles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three edges: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		boolean isValid = true;
		
		if ((a + b) < c || (a + c) < b || (b + c) < a) {
			isValid = false;
		}
		
		System.out.print("Can edges " + a + ", " + b + " and " + c + " form a triangle? " + isValid);
	}

}
