import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListDemo extends JFrame {
	final int NUMBER_OF_FLAGS = 9;
	
	// Declare an array of Strings for flag titles
	private String[] flagTitles = {"Canada", "China", "Denmark",
			"France", "Germany", "India", "Norway", "United Kngdom",
			"United States of America"};
	
	// The list for selecting countries
	private JList jlst = new JList(flagTitles);
	
	// Declare an ImageIcon array for the national flags of 9 countries
	private ImageIcon[] imageIcons = {
			new ImageIcon("image/ca.gif"),
			new ImageIcon("image/china.gif"),
			new ImageIcon("image/denmark.gif"),
			new ImageIcon("image/fr.gif"),
			new ImageIcon("image/germany.gif"),
			new ImageIcon("image/india.gif"),
			new ImageIcon("image/norway.gif"),
			new ImageIcon("image/uk.gif"),
			new ImageIcon("image/us.gif")
	};
	
	// Arrays of labels for displaying images
	private JLabel[] jlblImageViewer = new JLabel[NUMBER_OF_FLAGS];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListDemo frame = new ListDemo();
		frame.setSize(650,  500);
		frame.setTitle("ListDemo");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public ListDemo() {
		// Create a panel to hold nine label
		JPanel p = new JPanel(new GridLayout(3, 3, 5, 5));
		
		for (int i = 0; i < NUMBER_OF_FLAGS; i ++) {
			p.add(jlblImageViewer[i] = new JLabel());
			jlblImageViewer[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		// Add p and the list to the frame
		add(p, BorderLayout.CENTER);
		add(new JScrollPane(jlst), BorderLayout.WEST);
		
		// Register
		jlst.addListSelectionListener(new ListSelectionListener() {
			/** Handle list selection */
			public void valueChanged(ListSelectionEvent e) {
				// Get selected indices
				int[] indices = jlst.getSelectedIndices();
				
				int i;
				// Set icons in the labels
				for (i = 0; i < indices.length; i ++) {
					jlblImageViewer[i].setIcon(imageIcons[indices[i]]);
				}
				
				// Remove icons from the rset of the labels
				for (; i < NUMBER_OF_FLAGS; i ++) {
					jlblImageViewer[i].setIcon(null);
				}
			}
		});
	}
}
