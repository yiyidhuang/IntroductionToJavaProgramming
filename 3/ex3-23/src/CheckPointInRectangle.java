import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CheckPointInRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final double WIDTH = 10;
		final double HEIGHT = 5;
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double verticalDistance = Math.abs(x);
		double horizontalDistance = Math.abs(y);
		
		if ((verticalDistance <= (WIDTH / 2)) && (horizontalDistance <= (HEIGHT / 2))) {
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle.");
		} else {
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle.");
		}
	}

}
