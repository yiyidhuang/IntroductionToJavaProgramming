import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class Acceleration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v0, v1 and t: ");
		double initV0 = input.nextDouble();
		double finalV1 = input.nextDouble();
		double time = input.nextDouble();
		
		double accelerationV = (finalV1 - initV0) / time;
		
		System.out.println("The average acceleration is " + String.format("%.4f", accelerationV));
	}

}
