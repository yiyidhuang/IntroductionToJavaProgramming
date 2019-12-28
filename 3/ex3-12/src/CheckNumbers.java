import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CheckNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		final int DIVISOR1 = 5;
		final int DIVISOR2 = 6;
		
		if ((num % DIVISOR1 == 0) && (num % DIVISOR2 == 0)) {
			System.out.println(num + " is devisible by both " + DIVISOR1 + " and " + DIVISOR2 + ".");
		} else if ((num % DIVISOR1 != 0) && (num % DIVISOR2 == 0)) {
			System.out.println(num + " is devisible by " + DIVISOR1 + " or " + DIVISOR2 + ", but not both.");
		} else if ((num % DIVISOR1 == 0) && (num % DIVISOR2 != 0)) {
			System.out.println(num + " is devisible by " + DIVISOR1 + " or " + DIVISOR2 + ", but not both.");
		} else if ((num % DIVISOR1 != 0) && (num % DIVISOR2 != 0)) {
			System.out.println(num + " is not devisible by either " + DIVISOR1 + " or " + DIVISOR2 + ".");
		}
	}

}
