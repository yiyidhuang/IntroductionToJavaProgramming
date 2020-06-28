import java.util.Scanner;

public class QuotientWithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two integers
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		try {
			if (number2 == 0) 
				throw new ArithmeticException("Divisor cannot be zero");
			
			System.out.println(number1 + " / " + number2 + " is " + 
							(number1 / number2));
		} catch (ArithmeticException ex) {
			System.out.println("Exception: an integer " + 
						"cannot be divided by zero ");
		}
		
		System.out.println("Execution continues ...");
		
		input.close();
	}

}
