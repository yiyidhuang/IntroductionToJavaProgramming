import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CalculateTriangleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three points for a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double distanceX12 = Math.pow((x2 - x1), 2);
		double distanceY12 = Math.pow((y2 - y1), 2);
		double distance12 = Math.pow((distanceX12 + distanceY12), 0.5);
		
		double distanceX13 = Math.pow((x3 - x1), 2);
		double distanceY13 = Math.pow((y3 - y1), 2);
		double distance13 = Math.pow((distanceX13 + distanceY13), 0.5);
		
		double distanceX23 = Math.pow((x3 - x2), 2);
		double distanceY23 = Math.pow((y3 - y2), 2);
		double distance23 = Math.pow(distanceX23 + distanceY23, 0.5);
		
		double s = (distance12 + distance13 + distance23) / 2;
		double area = Math.pow((s * (s - distance12) * (s - distance13) * (s - distance23)), 0.5);
		
		System.out.println("The area of the triangle is " + area);
	}

}
