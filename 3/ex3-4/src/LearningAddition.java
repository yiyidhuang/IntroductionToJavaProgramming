import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class LearningAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"What is " + number1 + " + " + number2 + "?\n");
		
		int answer = input.nextInt();
		
		System.out.println(
				number1 + " + " + number2 + " = " + answer + " is " + 
				(number1 + number2 == answer));
	}

}
