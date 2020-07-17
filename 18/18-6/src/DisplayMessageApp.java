import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JApplet;
import javax.swing.JFrame;

public class DisplayMessageApp extends JApplet {
	private String message = "A default message"; // Message to dispaly
	private int x = 20; // Default x-coordinate
	private int y = 20; // Default y-coordiante
	
	/** Determin whether it is an application */
	private boolean isStandalone = false;
	
	/** Initialize the applet */
	public void init() {
		if (!isStandalone) {
			// Get parameter value from the HTML file
			message = getParameter("MESSAGE");
			x = Integer.parseInt(getParameter("X"));
			y = Integer.parseInt(getParameter("Y"));
		}
		
		// Create a message panel
		MessagePanel messagePanel = new MessagePanel(message);
		messagePanel.setFont(new Font("SansSerif", Font.BOLD, 20));
		messagePanel.setXCoordinate(x);
		messagePanel.setYCoordinate(y);
		
		// Add the message panel to the applet
		add(messagePanel);
	}
	
	/**
	 * Main method to display a message
	 * @param args
	 *        args[0] x-coordinate
	 *        args[1] y-coordinate
	 *        args[2] message
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a frame
		JFrame frame = new JFrame("DisplayMessageApp");
		
		// Create an instance of the applet
		DisplayMessageApp applet = new DisplayMessageApp();
		
		// It runs as an application
		applet.isStandalone = true;
		
		// Get parameters from the command line
		applet.getCommandLineParameters(args);
		
		// Add the applet instance to the frame
		frame.add(applet, BorderLayout.CENTER);
		
		// Invoke applet's init method
		applet.init();
		applet.start();
		
		// Display the frame
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	/** Get command-line parameters */
	private void getCommandLineParameters(String[] args) {
		// Check usage and get x, y and message
		if (args.length != 3) {
			System.out.println("Usage: java DisplayMessageApp x y message");
			System.exit(0);
		} else {
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			message = args[2];
		}
	}
}
