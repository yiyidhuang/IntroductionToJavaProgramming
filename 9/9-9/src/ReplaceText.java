import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Check command-line parameter usage
		if (args.length != 4) {
			System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
			System.exit(0);
		}
		
		// Check if source file exists
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " +  args[0] + " does not exist");
			System.exit(0);
		}
		
		// Check if target file exists
		File targetFile = new File(args[1]);
		if (targetFile.exists()) {
			System.out.println("Target file " + args[1] + " already exists");
			System.exit(0);
		}
		
		// Create a Scanner for input and a PrintWriter for output
		Scanner input = new Scanner(sourceFile);
		PrintWriter output = new PrintWriter(targetFile);
		
		while (input.hasNext()) {
			String s1 = input.nextLine();
			String s2 = s1.replaceAll(args[2], args[3]);
			output.println(s2);
		}
		
		input.close();
		output.close();
	}
}
