import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class QuadraticEquationOfOneVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c: ");
		double var_a = input.nextDouble();
		double var_b = input.nextDouble();
		double var_c = input.nextDouble();
		
		double discriminant = Math.pow((var_b * var_b) - 4 * var_a * var_c, 0.5);
		
		if (discriminant < 0 ) {
			System.out.print("The equation has no real roots\n");
			return;
		} else if (discriminant > 0) {
			double r1 = ((-1) * var_b + discriminant) / (2 * var_a);
			double r2 = ((-1) * var_b - discriminant) / (2 * var_a);
			System.out.print("The root are " + r1 + " and " + r2);
		} else {
			double r = ((-1) * var_b) / (2 * var_a);
			System.out.print("The root is " + r);
		}
	}

}
