import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class PerimeterOfTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the three edges: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
			System.out.println("The length's edges are invalid!");
			return;
		}
		
		double perimeter = a + b + c;
		
		System.out.println("THe perimeter of triangle is " + perimeter);
	}

}
