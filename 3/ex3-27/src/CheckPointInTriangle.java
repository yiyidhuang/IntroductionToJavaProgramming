import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CheckPointInTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final double x1 = 0;
		final double y1 = 0;
		final double x2 = 0;
		final double y2 = 100;
		final double x3 = 200;
		final double y3 = 0;
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double k = (y3 - y2)/(x3 - x2);
		
		if (y <= (k * x + y2)) {
			System.out.println("The point is in the triangle");
		} else {
			System.out.println("The point is not in the triangle");
		}
	}

}
