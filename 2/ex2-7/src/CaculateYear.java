import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CaculateYear {

	final static int DAYS_OF_A_YEAR = 365;
	final static int HOURS_OF_A_DAY = 24;
	final static int MINUTES_OF_A_HOUR = 60;
	final static int SECONDS_OF_A_MINUTE = 60;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		double currentMinutes = input.nextDouble();
		
		double hours = currentMinutes / MINUTES_OF_A_HOUR;
		double days = hours / HOURS_OF_A_DAY;
		int years = (int) (days / DAYS_OF_A_YEAR);
		int days_remainer = (int) (days % DAYS_OF_A_YEAR);
		
		System.out.print(currentMinutes + " minutes is approximately " 
					+ years + " and " + days_remainer + " days");
	}

}
