import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class GuessCoin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generate 0 or 1
		int random = ((int)(10 * Math.random())) % 2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 0 or 1 : ");
		int guess = input.nextInt();
		
		if (guess == random) {
			System.out.println("Yes, you are right!");
		} else {
			if (random == 1) {
				System.out.println("Sorry, the coin is obverse!");
			} else {
				System.out.println("Sorry, the coin is the reverse!");
			}
		}
	}

}
