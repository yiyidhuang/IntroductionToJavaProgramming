import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class SimpleIfDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		
		int number = input.nextInt();
		
		if (number % 5 == 0)
			System.out.println("HiFive");
		
		if (number % 2 == 0)
			System.out.println("HiEven");
	}

}
