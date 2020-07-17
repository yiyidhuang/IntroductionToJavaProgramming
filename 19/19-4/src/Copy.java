import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	/**
	 * Main method
	 * @param args[0] for source file
	 * @param args[1] for target file
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Check command-line parameter usage
		if (args.length != 2) {
			System.out.println(
					"Usage: java Copy source file target file");
			System.exit(0);
		}
		
		// Check whether source file exists
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + " not exist");
			System.exit(0);
		}
		
		// Check whether target file exists
		File targetFile = new File(args[1]);
		if (targetFile.exists()) {
			System.out.println("Target file " + args[1] + " already exists");
			System.exit(0);
		}
		
		// Create an input stream
		BufferedInputStream input = 
				new BufferedInputStream(new FileInputStream(sourceFile));
		
		// Create an output stream
		BufferedOutputStream output = 
				new BufferedOutputStream(new FileOutputStream(targetFile));
		
		// Continuously read a byte from input and write it to output
		int r; 
		int numberOfBytesCopyed = 0;
		while ((r = input.read()) != -1) {
			output.write((byte)r);
			numberOfBytesCopyed ++;
		}
		
		// Close streams
		input.close();
		output.close();
	}

}
