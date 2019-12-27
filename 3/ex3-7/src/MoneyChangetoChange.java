import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class MoneyChangetoChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"Enter an amount in double, for example 23.67: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		// Find the numbers of one dollar
		int numbersOfOneDollar = remainingAmount / 100;
		
		remainingAmount = remainingAmount % 100;
		
		// Find the numbers of quarters in the remaining amount
		int numbersOfQuarters = remainingAmount / 25;
		
		remainingAmount = remainingAmount % 25;
		
		// Find the numbers of dimes in the remaining amount
		int numbersOfDimes = remainingAmount / 10;
		
		remainingAmount = remainingAmount / 10;
		
		int numbersOfNickels = remainingAmount / 5;
		
		remainingAmount = remainingAmount / 5;
		
		int numbersOfPennis = remainingAmount;
		
		System.out.print(
				"Your amount " + amount + " consist of \n");
		
		if (numbersOfOneDollar == 1) {
			System.out.print("\t" + numbersOfOneDollar + " dollar");
		} else if (numbersOfOneDollar > 1) {
			System.out.print("\t" + numbersOfOneDollar + " dollars");
		}
		
		if (numbersOfQuarters == 1) {
			System.out.print(" and " + numbersOfQuarters + " quarter");
		} else if (numbersOfQuarters > 1) {
			System.out.print(" and " + numbersOfQuarters + " quarters");
		}	
		
		if (numbersOfDimes == 1) {
			System.out.print(" and " + numbersOfDimes + " dime");
		} else if(numbersOfDimes > 1) {
			System.out.print(" and " + numbersOfDimes + " dimes");
		}
		
		if (numbersOfNickels == 1) {
			System.out.print(" and " + numbersOfNickels + " nickel");
		} else if (numbersOfNickels > 1) {
			System.out.print(" and " + numbersOfNickels + " nickels");
		}
		
		if (numbersOfPennis == 1) {
			System.out.print(" and " + numbersOfPennis + " pennie");
		} else if (numbersOfPennis > 1) {
			System.out.print(" and " + numbersOfPennis + " pennis");
		}
	}

}
