import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldDemo extends RadioButtonDemo {
	protected MessagePanel messagePanel = 
			new MessagePanel();
	
	private JTextField jtfMessage = new JTextField(10);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextFieldDemo frame = new TextFieldDemo();
		frame.pack();
		frame.setTitle("TextFieldDemo");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public TextFieldDemo() {
		// Create a new panel to hold label and text field
		JPanel jpTextField = new JPanel();
		jpTextField.setLayout(new BorderLayout(5, 0));
		jpTextField.add(new JLabel("Enter a new message"), BorderLayout.WEST);
		jpTextField.add(jtfMessage, BorderLayout.CENTER);
		add(jpTextField, BorderLayout.NORTH);
		
		jtfMessage.setHorizontalAlignment(JTextField.RIGHT);
		
		// Register listener
		jtfMessage.addActionListener(new ActionListener() {
			/** Handle ActionEvent */
			public void actionPerformed(ActionEvent e) {
				messagePanel.setMessage(jtfMessage.getText());
				jtfMessage.requestFocusInWindow();
			}
		});
	}
}
