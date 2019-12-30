import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class Lottery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery = (int)(Math.random() * 1000);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick(three digits): ");
		
		int guess = input.nextInt();
		
		//Get digits from the lottery
		int digit1 = lottery / 100;
		int digit2 = (lottery % 100) / 10;
		int digit3 = lottery % 10;
		
		//Get digits from the guess
		int guess1 = guess / 100;
		int guess2 = (guess % 100) / 10;
		int guess3 = guess % 10;
		
		if (guess == lottery) {
			System.out.println("Exact match: you win $10,000");
		} else if ((guess1 == digit1 && guess2 == digit3 && guess3 == digit2)
				|| (guess1 == digit2 && guess2 == digit1 && guess3 == digit3)
				|| (guess1 == digit2 && guess2 == digit3 && guess3 == digit2)
				|| (guess1 == digit3 && guess2 == digit1 && guess3 == digit2)
				|| (guess1 == digit3 && guess2 == digit2 && guess3 == digit1)) {
			System.out.println("Match all digits: you win $3,000");
		} else if ((guess1 == digit1 || guess1 == digit2 || guess3 == digit3
				|| guess2 == digit1 || guess2 == digit2 || guess2 == digit3)
				|| guess3 == digit1 || guess3 == digit2 || guess3 == digit3) {
			System.out.println("Match one digit: you win $1,000");
		} else {
			System.out.println("Sorry, no match");
		}
	}

}
