import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class OperationTry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int FIVE = 5;
		final int SIX = 6;
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		System.out.println("Is " + num 
				+ " divisible by " 
				+ FIVE + " and " + SIX + "? " 
				+ ((num % 5 == 0) && (num % 6 == 0)));
		
		System.out.println("Is " + num 
				+ " divisible by " 
				+ FIVE + " or " + SIX + "? " 
				+ ((num % 5 == 0) || (num % 6 == 0)));
		
		System.out.println("Is " + num 
				+ " divisible by " 
				+ FIVE + " and " + SIX + "? " 
				+ ((num % 5 == 0) ^ (num % 6 == 0)));
	}

}
