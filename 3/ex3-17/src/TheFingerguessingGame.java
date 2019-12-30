import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class TheFingerguessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		int x = rd.nextInt(3) + 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("scissor (0), rock(1), paper(2): ");
		
		int guessing = input.nextInt();
		
		if (x == 0) {
			if (guessing == 1) {
				System.out.println("The computer is rock, You are scissor, You lost");
			} else if (guessing == 2) {
				System.out.println("The Computer is rock, You are paper, You won");
			}
		} else if (x == 1) {
			if (guessing == 0) {
				System.out.println("The Computer is scissor, You are rock, You won");
			} else if (guessing == 2) {
				System.out.println("The Computer is scissor, You are paper, You lost");
			}
		} else if (x == 2) {
			if (guessing == 0) {
				System.out.println("The computer is paper, You are rock, You lost");
			} else if (guessing == 1) {
				System.out.println("The computer is paper, You are scissor, You won");
			}
		}
	}

}
