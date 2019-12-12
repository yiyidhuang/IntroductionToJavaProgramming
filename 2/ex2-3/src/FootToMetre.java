import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class FootToMetre {
	final static double COEF_FEET_METRE = 0.305;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Read the value of feet
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		
		double metre = feet * COEF_FEET_METRE;
		
		System.out.println(feet + " feet is " + metre + " metres.");
	}

}
