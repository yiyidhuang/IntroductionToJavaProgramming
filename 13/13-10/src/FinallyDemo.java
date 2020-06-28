
public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.io.PrintWriter output = null;
		
		try {
			// Create a file
			output = new java.io.PrintWriter("text.txt");
			
			// Write formatted output to the new file
			output.println("Welcome to Java");
		} catch (java.io.IOException ex) {
			ex.printStackTrace();
		} finally {
			// Close the file
			if (output != null) 
				output.close(); 
		}
		
		System.out.println("End of program");
	}

}
