import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonDemo extends JFrame {
	// Create a panel for displaying message
	protected MessagePanel messagePanel = 
			new MessagePanel("Welcome to Java");
	
	// Declare two buttons to move the message left and right
	private JButton jbtLeft = new JButton("<=");
	private JButton jbtRight = new JButton("=>");
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonDemo frame = new ButtonDemo();
		frame.setTitle("ButtonDemo");
		frame.setSize(250, 100);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public ButtonDemo() {
		// Set the background color of messagePanel
		messagePanel.setBackground(Color.white);
		
		// Create Panel jpButtons to hold two Button "<=" and "right =>"
		JPanel jpButtons = new JPanel();
		jpButtons.add(jbtLeft);
		jpButtons.add(jbtRight);
		
		// Set keyboard mnemonics
		jbtLeft.setMnemonic('L');
		jbtRight.setMnemonic('R');
		
		// Set tool tip text on the buttons
		jbtLeft.setToolTipText("Move message to left");
		jbtRight.setToolTipText("Move message to right");
		
		// Place panels in the frame
		setLayout(new BorderLayout());
		add(messagePanel, BorderLayout.CENTER);
		add(jpButtons, BorderLayout.SOUTH);
		
		// Register listeners with the buttons
		jbtLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				messagePanel.moveLeft();
			}			
		});
		jbtRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				messagePanel.moveRight();
			}
		});
	}
}
