import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class LinearEquations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c, d, e, f: ");
		double var_a = input.nextDouble();
		double var_b = input.nextDouble();
		double var_c = input.nextDouble();
		double var_d = input.nextDouble();
		double var_e = input.nextDouble();
		double var_f = input.nextDouble();
		
		double discriminant = var_a * var_d - var_b * var_c;
		boolean hasSolution = (discriminant == 0) ? false : true;
		if (!hasSolution) {
			System.out.println("The equation has no solution.");
			return;
		}
		
		double root_x = (var_e * var_d - var_b * var_f) / discriminant;
		double root_y = (var_a * var_f - var_e * var_c) / discriminant;
		
		System.out.println("x is " + root_x + " and y is " + root_y);
	}

}
