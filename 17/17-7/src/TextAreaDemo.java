import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TextAreaDemo extends JFrame {

	// Declare and create a description panel
	private DescriptionPanel descriptionPanel = new DescriptionPanel();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextAreaDemo frame = new TextAreaDemo();
		frame.pack();
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("TextAreaDemo");
		frame.setVisible(true);
	}

	public TextAreaDemo() {
		// Set title, text and image in the description panel
		descriptionPanel.setTitle("Canada");
		String description = "The Maple Leaf flag \n\n" + 
				"The Canadian National Flag was adopted by the Canadian " +
				"Pariliament on October 22, 1964 and was proclaimed into law" +
				"by Her Majesty Queen Elizabeth II (the Queen of Canada) on " +
				"February 15, 1965. The Canadian Flag (conlloquially known " +
				"as The Maple Leaf Flag) is a red flag of the prportions " +
				"two by length and one by width, containing in its center a " +
				"white square, with a single red stylized elevent-point " +
				"maple leaf centered in the white square.";
		descriptionPanel.setDescription(description);
		descriptionPanel.setImageIcon(new ImageIcon("image/ca.gif"));
		
		// Add the description panel to the frame
		setLayout(new BorderLayout());
		add(descriptionPanel, BorderLayout.CENTER);
	}	
}
