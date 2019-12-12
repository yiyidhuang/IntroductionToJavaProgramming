import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class GetCurrentTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the time zone offset to GMT: ");
		int timeZone = input.nextInt();		
		
		long totalMilliseconds = System.currentTimeMillis();
		                         
		long totalSecond = totalMilliseconds / 1000;
		
		long currentSecond = totalSecond % 60;
		
		long totalMinutes = totalSecond / 60;
		
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHour = totalHours % 24;
		
		if (timeZone < 0) {
			currentHour = 24 - (currentHour + timeZone);
		} else {
			currentHour = currentHour + timeZone;
		}
		
		System.out.println("Current time(Local) is " + (currentHour) + ":"
				+ currentMinute + ":" + currentSecond);
	}

}
