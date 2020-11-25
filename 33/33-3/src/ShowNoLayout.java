import java.awt.Color;

import javax.swing.JApplet;
import javax.swing.JButton;

public class ShowNoLayout extends JApplet {
	private JButton jbtRed = new JButton("Red");
	private JButton jbtBlue = new JButton("Blue");
	private JButton jbtGreen = new JButton("Green");
	
	public ShowNoLayout() {
		// Set foreground color for the buttons
		jbtRed.setForeground(Color.RED);
		jbtBlue.setForeground(Color.BLUE);
		jbtGreen.setForeground(Color.GREEN);
		
		// Specify a null layout manager
		setLayout(null);
		
		// Add components to container
		add(jbtRed);
		add(jbtBlue);
		add(jbtGreen);
		
		// Put components in the right place
		jbtRed.setBounds(150, 50, 100, 50);
		jbtBlue.setBounds(100, 100, 100, 50);
		jbtGreen.setBounds(200, 100, 100, 50);
	}
}
