import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class LottoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		boolean[] isCovered = new boolean[99]; // Default is false;
		
		// Read each number and mark its corresponding element covered
		int number = input.nextInt();
		while (number != 0) {
			isCovered[number - 1] = true;
			number = input.nextInt();
		}
		
		// Check whether all covered
		boolean allCovered = true; // Assume all covered initially
		for (int i = 0; i < 99; i ++) {
			if (!isCovered[i]) {
				allCovered = false; // Find one number not covered
				break;
			}
			
			// Display result
			if (allCovered) {
				System.out.println("The tickets cover all numbers");
			} else {
				System.out.println("The tickets don't cover all numbers");
			}
		}
	}

}
