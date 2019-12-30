import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class ZellerConsistency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year: (e.g., 2008): ");
		int year = input.nextInt();
		
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		
		System.out.print("Enter the day of the month: 1-31: ");
		int day = input.nextInt();
	
		switch (month){
        	case 1:
        		month = 13;
            	year--;
            	break;
        	case 2:
        		month = 14;
            	year--;
            	break;
		}
		
		int j = Math.abs (year/100);
		int k = year % 100;
		int h = ((day + (int)((26 * (month + 1)) / 10) + k + (int)(k / 4) + (int)(j / 4) + (5 * j))) % 7;

		if (h == 0) {
			System.out.println("Day of the week is Saturaday");
		} else if (h == 1) {
			System.out.println("Day of the week is Sunday");
		} else if (h == 2) {
			System.out.println("Day of the week is Monday");
		} else if (h == 3) {
			System.out.println("Day of the week is Tuesday");
		} else if (h == 4) {
			System.out.println("Day of the week is Wednesday");
		} else if (h == 5) {
			System.out.println("Day of the week is Thursday");
		} else if (h == 6) {
			System.out.println("Day of the week is Friday");
		}
	}

}
 