import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class SumOfAllFiguresInIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int integers = input.nextInt();
		int sum = 0;
		while (integers >= 10) {
			sum += integers % 10;
			integers /= 10;
		}
		
		sum += integers;
		
		System.out.println("The sum of the digits is " + sum);
	}

}
