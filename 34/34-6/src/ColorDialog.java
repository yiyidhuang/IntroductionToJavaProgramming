import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorDialog extends JDialog {
	// Declare color component values and selected color
	private int redValue, greenValue, blueValue;
	private Color color = null;
	
	// Create sliders
	private JSlider jslRed = new JSlider(0, 128);
	private JSlider jslGreen = new JSlider(0, 128);
	private JSlider jslBlue = new JSlider(0, 128);
	
	// Create two buttons
	private JButton jbtOK = new JButton("OK");
	private JButton jbtCancel = new JButton("Cancel");
	
	// Create a panel to display the selected color
	private JPanel jpSelectedColor = new JPanel();
	
	public ColorDialog() {
		this(null, true);
	}
	
	public ColorDialog(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		setTitle("Choose Color");
		
		// Group two buttons OK and Cancel
		JPanel jpButtons = new JPanel();
		jpButtons.add(jbtOK);
		jpButtons.add(jbtCancel);
		
		// Group labels
		JPanel jpLabels = new JPanel();
		jpLabels.setLayout(new GridLayout(3, 0));
		jpLabels.add(new JLabel("Red"));
		jpLabels.add(new JLabel("Green"));
		jpLabels.add(new JLabel("Blue"));
		
		// Group sliders for selecting red, green and blue colors
		JPanel jpSliders = new JPanel();
		jpSliders.setLayout(new GridLayout(3, 0));
		jpSliders.add(jslRed);
		jpSliders.add(jslGreen);
		jpSliders.add(jslBlue);
		
		// Group jpLabels and jpSliders
		JPanel jpSelectColor = new JPanel();
		jpSelectColor.setLayout(new BorderLayout());
		jpSelectColor.setBorder(BorderFactory.createTitledBorder("Select Color"));
		jpSelectColor.add(jpLabels, BorderLayout.WEST);
		jpSelectColor.add(jpSliders, BorderLayout.CENTER);
		
		// Group jpSelectColor and jpSelectedColor
		JPanel jpColor = new JPanel();
		jpColor.setLayout(new BorderLayout());
		jpColor.add(jpSelectColor, BorderLayout.SOUTH);
		jpColor.add(jpSelectColor, BorderLayout.CENTER);
		
		// Place jpButtons and jpColor into the dialog box
		add(jpButtons, BorderLayout.SOUTH);
		add(jpColor, BorderLayout.CENTER);
		pack();
		
		jbtOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		}); 
		
		jbtCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = null;
				setVisible(false);
			}
		});
		
		jslRed.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				redValue = jslRed.getValue();
				color = new Color(redValue, greenValue, blueValue);
				jpSelectedColor.setBackground(color);
			}
		});
		
		jslGreen.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				greenValue = jslGreen.getValue();
				color = new Color(redValue, greenValue, blueValue);
				jpSelectedColor.setBackground(color);
			}
		});
		
		jslBlue.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				blueValue = jslBlue.getValue();
				color = new Color(redValue, greenValue, blueValue);
				jpSelectedColor.setBackground(color);
			}
		});
	}
	
	public Dimension getPreferredSize() {
		return new java.awt.Dimension(200, 200);
	}
	
	/** Return color */
	public Color getColor() {
		return color;
	}
}
