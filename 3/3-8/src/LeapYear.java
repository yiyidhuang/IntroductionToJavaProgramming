import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		boolean isLeapYear = 
				(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		// Display the result
		System.out.println(year + " is a leap year? " + isLeapYear);
	}

}
