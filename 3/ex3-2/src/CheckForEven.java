import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CheckForEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		boolean isEven = false;
		
		isEven = (number % 2 == 0) ? true : false;
		System.out.print("Is " + number + " an even number? " + isEven);
	}

}
