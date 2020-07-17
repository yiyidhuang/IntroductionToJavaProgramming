import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonDemo extends CheckBoxDemo {
	protected MessagePanel messagePanel = 
			new MessagePanel();
	
	// Declare radio buttons
	private JRadioButton jrbRed, jrbGreen, jrbBlue;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButtonDemo frame = new RadioButtonDemo();
		frame.setSize(500, 200);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("RadioButtonDemo");
		frame.setVisible(true);
	}
	
	public RadioButtonDemo() {
		// Create a new panle to hold check boxes
		JPanel jpRadioButtons = new JPanel();
		jpRadioButtons.setLayout(new GridLayout(3, 1));
		jpRadioButtons.add(jrbRed = new JRadioButton("Red"));
		jpRadioButtons.add(jrbGreen = new JRadioButton("Green"));
		jpRadioButtons.add(jrbBlue = new JRadioButton("Blue"));
		
		add(jpRadioButtons, BorderLayout.WEST);
		
		// Create a radio-button group to group three buttons
		ButtonGroup group = new ButtonGroup();
		group.add(jrbRed);
		group.add(jrbGreen);
		group.add(jrbBlue);
		
		// Register listeners for radio buttons
		jrbRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				messagePanel.setForeground(Color.red);
			}
		});
		jrbGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				messagePanel.setForeground(Color.green);
			}
		});
		jrbBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				messagePanel.setForeground(Color.blue);
			}
		});
		
		// Set initial message color to blue
		jrbBlue.setSelected(true);
		messagePanel.setForeground(Color.blue);
	}

}
