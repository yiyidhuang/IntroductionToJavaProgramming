import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class GetTotalDaysOfOneMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the year and month(Year, Month): ");
		int year = input.nextInt();
		int month = input.nextInt();
		
		if (month < 0 || month > 12) {
			System.out.print("The month is invalid!");
			
			return;
		}
		
		boolean isLeapYear = false;
		
		//Check the leap year
		if ((year % 4 == 0) && (year % 100 != 0)) {
			isLeapYear = true;
		} else if (year % 400 == 0) {
			isLeapYear = true;
		}
		
		String monthStr[] = {"January", "February", "March", "April", 
							"May", "June", "July", "August",
							"September", "October", "November", "December"};
		
		int daysOfMonth[] = {
							31, 28, 30, 31, 30, 31, 30,
							31, 31, 30, 31, 30, 29};
		
		if ((isLeapYear == true) && (month == 2)) {
			System.out.println(monthStr[month - 1] + " " + year + " has " + daysOfMonth[12] + " days.");
		} else {
			System.out.println(monthStr[month - 1] + " " + year + " has " + daysOfMonth[month - 1] + " days.");
		}
	}		
}
