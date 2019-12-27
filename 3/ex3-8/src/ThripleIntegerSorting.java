import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class ThripleIntegerSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		
		
		
		// Sort the three numbers
		if (num1 > num2) {
			int temp = num1;			
			num1 = num2;
			num2 = temp;
		} 
		
		if (num1 > num3) {			
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}
				
		if (num2 > num3) {
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}		
		
		System.out.print("After sorting: " + num1 + " " + num2 + " " + num3);
	}
}
