import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CheckPointInCircular {

	final static double DISTANCE = 10;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double radius = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);
		
		if (radius <= DISTANCE) {
			System.out.println("Point (" + x + ", " + y + ") is in the circl");
		} else {
			System.out.println("Point (" + x + ", " + y + ") is not in the circl");
		}
	}

}
