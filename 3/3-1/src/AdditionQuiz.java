import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class AdditionQuiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() * 7 % 10);
		
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"What is " + number1 + " + " + number2 + "? ");
		
		int answer = input.nextInt();
		
		System.out.println(
				number1 + " + " + number2 + " = " + answer + " is " + 
				(number1 + number2 == answer));
	}

}
