import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class AsciiToChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Read the ASCII code value.
		System.out.print("Enter an ASCII code: ");
		int ascii_code = input.nextInt();
		
		// Mapping the character
		char char_code = (char)ascii_code;
		System.out.println("The character for ASCII code " + ascii_code + " is " + char_code);
	}

}
