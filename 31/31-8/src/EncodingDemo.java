import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EncodingDemo {

	public static void main(String[] args) 
		throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter output = new PrintWriter("temp.txt", "GB18030");
		output.print("\u6B22\u8FCE Welcome \u03b1\u03b2\u03b3");
		output.close();
		
		Scanner input = new Scanner(new File("temp.txt"), "GB18030");
		JOptionPane.showMessageDialog(null, input.nextLine());
	}

}
