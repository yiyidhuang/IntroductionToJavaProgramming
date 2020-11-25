import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CreateLargeFile {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub		                              	
		DataOutputStream output = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("largedata.dat")));
		
		for (int i = 0; i < 800004; i ++) {
			output.writeInt((int)(Math.random() * 1000000));
		}
		
		output.close();
		
		// Display first 100 numbers
		DataInputStream input = 
				new DataInputStream(new FileInputStream("largedata.dat"));
		
		for (int i = 0; i < 100; i ++) {
			System.out.print(input.readInt() + " ");
		}
		
		input.close();
	}
}
