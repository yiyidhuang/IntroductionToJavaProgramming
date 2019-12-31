import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class RectanglePosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter r1's center x-,y-coordinates, width and height: ");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		
		System.out.print("Enter r2's center x-,y-coordinates, width and height: ");
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();
		
		double xDis = Math.abs(x1 - x2);
		double yDis = Math.abs(y1 - y2);
		
		if (xDis <= (w1 - w2) / 2 && yDis <= (h1 - h2)/2) {
			System.out.println("r2 is inside r1");
		} else if (xDis <= (w1 + w2) / 2 && yDis <= (h1 - h2) / 2) {
			System.out.println("r2 overlaps r1");
		} else {
			System.out.println("r2 does not overlap r1");
		}
	}

}
