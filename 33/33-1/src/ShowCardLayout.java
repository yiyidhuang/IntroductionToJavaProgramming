import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ShowCardLayout extends JApplet {
	private CardLayout cardLayout = new CardLayout(20, 10);
	private JPanel cardPanel = new JPanel(cardLayout);
	
	private JButton jbtFirst, jbtNext, jbtPrevious, jbtLast;
	private JComboBox jcboImage;
	private final int NUM_OF_FLAGS = 6;
	
	public ShowCardLayout() {
		cardPanel.setBorder(new javax.swing.border.LineBorder(Color.red));
		
		// Add 9 labels for displaying images into cardPanel
		for (int i = 1; i <= NUM_OF_FLAGS; i ++) {
			JLabel label = new JLabel(new ImageIcon("iamge/flag" + i  + ".gif"));
			cardPanel.add(label, String.valueOf(i));
		}
		
		// Panel p to hold buttons and a combo box
		JPanel p = new JPanel();
		p.add(jbtFirst = new JButton("First"));
		p.add(jbtNext = new JButton("Next"));
		p.add(jbtPrevious = new JButton("Previous"));
		p.add(jbtLast = new JButton("Last"));
		p.add(new JLabel("Image"));
		p.add(jcboImage = new JComboBox());
		
		// Initialize combo box items
		for (int i = 1; i <= NUM_OF_FLAGS; i ++) {
			jcboImage.addItem(String.valueOf(i));
		}
		
		// Place panels in the frame
		add(cardPanel, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);
		
		// Register listeners with the source objects
		jbtFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Show the first compoents in cardPanel
				cardLayout.first(cardPanel);
			}
		});
		
		jbtNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Show the first component in cardPanel
				cardLayout.next(cardPanel);
			}
		});
		
		jbtPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Show the first component in cardPanel
				cardLayout.last(cardPanel);
			}
		});
		
		jbtLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Show the first component in cardPanel
				cardLayout.last(cardPanel);
			}
		});
		
		jcboImage.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// Show the component at specified index
				cardLayout.show(cardPanel, (String)e.getItem());
			}
		});
	}
}
