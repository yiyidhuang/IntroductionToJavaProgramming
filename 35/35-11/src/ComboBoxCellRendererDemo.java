import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxCellRendererDemo extends JApplet {
	private final static int NUMBER_OF_NATIONS = 7;
	private String[] nations = new String[] {
		"Denmark",
		"Germany",
		"China",
		"India",
		"Norway",
		"UK",
		"US"
	};
	
	private ImageIcon[] icons = new ImageIcon[NUMBER_OF_NATIONS];
	private ImageIcon[] bigIcons = new ImageIcon[NUMBER_OF_NATIONS];
	
	// Create a combo box model
	private DefaultComboBoxModel model = new DefaultComboBoxModel();
	
	// Create a combo box with the specified model
	private JComboBox jcboCountries = new JComboBox(model);
	
	// Create a list cell renderer
	private MyListCellRenderer renderer = new MyListCellRenderer();
	
	// Create a label for displaying image
	private JLabel jlblImage = new JLabel("", JLabel.CENTER);
	
	/** Construct the applet */
	public ComboBoxCellRendererDemo() {
		// Load small and large image icons
		for (int i = 0; i < NUMBER_OF_NATIONS; i ++) {
			icons[i] = new ImageIcon(getClass().getResource("image/flagIcon" + i + ".gif"));
			model.addElement(new Object[] {icons[i], nations[i]});
			bigIcons[i] = new ImageIcon(getClass().getResource("image/flag" + i + ".gif"));
		}
		
		// Set list cell renderer for the combo box
		jcboCountries.setRenderer(renderer);
		jlblImage.setIcon(bigIcons[0]);
		add(jcboCountries, java.awt.BorderLayout.NORTH);
		add(jlblImage, java.awt.BorderLayout.CENTER);
		
		// Register listener
		jcboCountries.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				jlblImage.setIcon(bigIcons[jcboCountries.getSelectedIndex()]);
			}
		});
	}

	/** Main method */
	public static void main(String[] args) {
		ComboBoxCellRendererDemo applet = new ComboBoxCellRendererDemo();
		JFrame frame = new JFrame();
		// EXIT_ON_CLOSE == 3
		frame.setDefaultCloseOperation(3);
		frame.setTitle("ComboBoxCellRendererDemo");
		frame.getContentPane().add(applet, BorderLayout.CENTER);
		applet.init();
		applet.start();
		frame.setSize(400, 320);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
