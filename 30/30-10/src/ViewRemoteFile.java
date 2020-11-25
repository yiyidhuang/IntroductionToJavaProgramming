import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewRemoteFile extends JApplet {
	// Button to view the file
	private JButton jbtView = new JButton("View");
	
	// Text field to receive file name
	private JTextField jtfURL = new JTextField(12);
	
	// Text area to store file
	private JTextArea jtaFile = new JTextArea();
	
	// Label to display status
	private JLabel jlblStatus = new JLabel();
	
	/** Initialize the applet */
	public void init() {
		// Create a panel to hold a label, a text field, and a button
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		p1.add(new JLabel("Filename"), BorderLayout.WEST);
		p1.add(jtfURL, BorderLayout.CENTER);
		p1.add(jbtView, BorderLayout.EAST);
		
		// Place text area and panel p to the applet
		setLayout(new BorderLayout());
		add(new JScrollPane(jtaFile), BorderLayout.CENTER);
		add(p1, BorderLayout.NORTH);
		add(jlblStatus, BorderLayout.SOUTH);
		
		// Register listener to handle the "View" button
		jbtView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showFile();
			}
		});
	}
	
	private void showFile() {
		java.util.Scanner input = null; // Use Scanner for text input
		URL url = null;
		
		try {
			// Obtain URL from the text field
			url = new URL(jtfURL.getText().trim());
			
			// Create a Scanner for input stream
			input = new java.util.Scanner(url.openStream());
			
			// Read a line and append the line to the text area
			while (input.hasNext()) {
				jtaFile.append(input.nextLine() + "\n");
			}
			
			jlblStatus.setText("File loaded successfully");
		} catch (MalformedURLException ex) {
			jlblStatus.setText("URL " + url + " not found.");
		} catch (IOException e) {
			jlblStatus.setText(e.getMessage());
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a frame
		JFrame frame = new JFrame("View File From a Web Server");
		
		// Create an instance of ViewRemoteFile
		ViewRemoteFile applet = new ViewRemoteFile();
		
		// Add the applet instance the frame
		frame.add(applet, BorderLayout.CENTER);
		
		// Invoke init() and start()
		applet.init();
		applet.start();
		
		// Display the frame
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
