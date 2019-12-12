import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class ComputeChangeInGraphic {

	final static int MONETARY_VALUE_ONE_HUNDRED = 100;
	final static int MONETARY_VALUE_QUARTER = 25;
	final static int MONETARY_VALUE_TEN = 10;
	final static int MONETARY_VALUE_FIVE = 5;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		
		String amountString = JOptionPane.showInputDialog("Enter an amount an integer, for example 1156 \nfor 11 dollars and 56 cents");
		amount = Integer.parseInt(amountString);
		
		int remainingAmount = amount;
		int numOfOneDollars = remainingAmount / MONETARY_VALUE_ONE_HUNDRED;
		
		remainingAmount = remainingAmount % MONETARY_VALUE_ONE_HUNDRED;
		
		int numOfQuarters = remainingAmount / MONETARY_VALUE_QUARTER;
		remainingAmount = remainingAmount % MONETARY_VALUE_QUARTER;
		
		int numOfDimes = remainingAmount / MONETARY_VALUE_TEN;
		remainingAmount = remainingAmount % MONETARY_VALUE_TEN;
		
		int numOfNickels = remainingAmount / MONETARY_VALUE_FIVE;
		remainingAmount = remainingAmount % MONETARY_VALUE_FIVE;
		
		int numOfPennies = remainingAmount;
		
		System.out.println("Your amount " + amount + " consists of ");
		System.out.println(numOfOneDollars + "\t dollars");
		System.out.println(numOfQuarters + "\t quarters");
		System.out.println(numOfDimes + "\t dimes");
		System.out.println(numOfNickels + "\t nickels");
		System.out.println(numOfPennies + "\t pennies");
	}

}
