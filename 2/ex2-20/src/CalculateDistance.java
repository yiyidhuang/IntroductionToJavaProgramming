import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CalculateDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double distanceX = Math.pow((x2 - x1), 2);
		double distanceY = Math.pow((y2 - y1), 2);
		
		double distancePoints = Math.pow(distanceX + distanceY, 0.5);
		
		System.out.println("The distance of the two points is " + distancePoints);
	}

}
