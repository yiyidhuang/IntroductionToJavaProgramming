import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputFromConsole = new Scanner(System.in);
		
		// Prompt the user to entera file name
		System.out.print("Enter a file name: ");
		String filename = inputFromConsole.nextLine();
		
		try {
			Scanner inputFromFile = new Scanner(new File(filename));
			System.out.println("File " + filename + " exists ");
		} catch (FileNotFoundException ex) {
			System.out.println("Exception: " + filename + " not found");
		}
	}

}
