import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CheckISBN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"Enter the nine integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		int num6 = input.nextInt();
		int num7 = input.nextInt();
		int num8 = input.nextInt();
		int num9 = input.nextInt();
		
		int checkBit = (num1 + 
				num2 * 2 + 
				num3 * 3 + 
				num4 * 4 + 
				num5 * 5 + 
				num6 * 6 +
				num7 * 7 +
				num8 * 8 +
				num9 * 9) % 11;
		
		if (checkBit == 10) {
			System.out.print("The ISBN is " + num1 + num2 + num3 + num4 + 
					num5 + num6 + num7 + num8 + num9 + "X");
		} else {
			System.out.print("The ISBN is " + num1 + num2 + num3 + num4 + 
					num5 + num6 + num7 + num8 + num9 + checkBit);
		}
	}

}
