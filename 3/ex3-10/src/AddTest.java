import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class AddTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generate two integers
		int num1 = (int)(Math.random() * 100);
		int num2 = (int)(Math.random() * 100);
				
		System.out.print("What is " + num1 + " + " + num2 + "? ");		
		
		Scanner input = new Scanner(System.in);
		
		int answer = input.nextInt();
		
		if (num1 + num2 == answer) {
			System.out.println("You are correct!");
		} else {
			System.out.println("Your answer is wrong!\n" + num1 + " + "
					+ num2 + " should be " + (num1 + num2));
		}
	}

}
