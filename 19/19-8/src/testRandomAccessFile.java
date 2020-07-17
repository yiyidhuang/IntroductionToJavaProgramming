import java.io.IOException;
import java.io.RandomAccessFile;

public class testRandomAccessFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Create a random-access file
		RandomAccessFile inout = new RandomAccessFile("input.dat", "rw");
		
		// Clear the file to destroy the old contents, if any
		inout.setLength(0);
		
		// Write new integers to the file
		for (int i = 0; i < 200; i ++)
			inout.write(i);
		
		// Display the current length of the file
		System.out.println("Current file length is " + inout.length());
		
		// Retrieve the first number
		inout.seek(0);
		System.out.println("The first number is " + inout.length());
		
		// Retrieve the second number
		inout.seek(1 * 4); // Move the file pointer t the second number
		System.out.println("The second number is " + inout.readInt());
		
		// Retrieve the tenth number
		inout.seek(9 * 4); // Move the file pointer to the tenth number
		System.out.println("The tenth number is " + inout.readInt());
		
		// Modify the eleventh number
		inout.writeInt(555);
		
		// Append a new number
		inout.seek(inout.length()); // Move the file pointer to the end
		inout.writeInt(999);
		
		// Display the new length
		System.out.println("The new length is " + inout.length());
		
		// Retrieve the new eleventh number
		inout.seek(10 * 4); // Move the file pointer to the next number
		System.out.println("The eleventh number is " + inout.readInt());
		
		inout.close();
	}

}
