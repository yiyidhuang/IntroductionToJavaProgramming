import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class TextEditor extends JApplet {
	// Declare and create image icons
	private ImageIcon openImageIcon = new ImageIcon(getClass().getResource("image/open.gif"));
	private ImageIcon saveImageIcon = new ImageIcon(getClass().getResource("image/save.gif"));
	
	// Create menu items
	private JMenuItem jmiOpen = new JMenuItem("Open", openImageIcon);
	private JMenuItem jmiSave = new JMenuItem("Save", saveImageIcon);
	private JMenuItem jmiClear = new JMenuItem("Clear");
	private JMenuItem jmiExit = new JMenuItem("Exit");
	private JMenuItem jmiForeground = new JMenuItem("Foreground");
	private JMenuItem jmiBackground = new JMenuItem("Background");
	
	// Create buttons to be palced in the toolbar
	private JButton jbtOpen = new JButton(openImageIcon);
	private JButton jbtSave = new JButton(saveImageIcon);
	private JLabel jlblStatus = new JLabel();
	
	// Create a JFileChooser with the current directory
	private JFileChooser jFileChooser1 = new JFileChooser(new File("."));
	
	// Create a text area
	private JTextArea jta = new JTextArea();
	
	public TextEditor() {
		// Add menu items to the menu
		JMenu jMenu1 = new JMenu("File");
		jMenu1.add(jmiOpen);
		jMenu1.add(jmiSave);
		jMenu1.add(jmiClear);
		jMenu1.addSeparator();
		jMenu1.add(jmiExit);
		
		// Add menu items to the menu
		JMenu jMenu2 = new JMenu("Edit");
		jMenu2.add(jmiForeground);
		jMenu2.add(jmiBackground);
		
		// Add menu to the menu bar
		JMenuBar jMenuBar1 = new JMenuBar();
		jMenuBar1.add(jMenu1);
		jMenuBar1.add(jMenu2);
		
		// Set the menu bar
		setJMenuBar(jMenuBar1);
		
		// Create toolbar
		JToolBar jToolBar1 = new JToolBar();
		jToolBar1.add(jbtOpen);
		jToolBar1.add(jbtSave);
		
		jmiOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				open();
			}
		});
		
		jmiSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				save();
			}
		});
		
		jmiClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jta.setText(null);
			}
		});
		
		jmiExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.exit(0);
			}
		});
		
		jmiForeground.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Color selectedColor = 
						JColorChooser.showDialog(
								null, 
								"Chooser Foreground Color", 
								jta.getForeground());
				
				if (selectedColor != null) {
					jta.setForeground(selectedColor);
				}
			}
		});
		
		jmiBackground.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Color selectedColor = 
						JColorChooser.showDialog(
								null, 
								"Choose Background Color", 
								jta.getForeground());
				
				if (selectedColor != null) {
					jta.setBackground(selectedColor);
				}
			}
		});
		
		jbtOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				open();
			}
		});
		
		jbtSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				save();
			}
		});
		
		add(jToolBar1, BorderLayout.NORTH);
		add(jlblStatus, BorderLayout.SOUTH);
		add(new JScrollPane(jta), BorderLayout.CENTER);
	}
	
	/** Open file */
	private void open() {
		if (jFileChooser1.showOpenDialog(this) == 
				JFileChooser.APPROVE_OPTION) {
			open(jFileChooser1.getSelectedFile());
		}
	}
	
	/** Open file with the specified File instance */
	private void open(File file) {
		try {
			// Read from the specified file and store it in ita
			BufferedInputStream in = new BufferedInputStream(
					new FileInputStream(file));
			
			byte[] b = new byte[in.available()];
			in.read(b, 0, b.length);
			jta.append(new String(b, 0, b.length));
			in.close();
			
			// Display the status of the Open file operation in jlblStatus
			jlblStatus.setText(file.getName() + " Opened");
		} catch (IOException ex) {
			jlblStatus.setText("Error opening " + file.getName());
		}
	}
	
	/** Save file */
	private void save() {
		if (jFileChooser1.showSaveDialog(this) == 
				JFileChooser.APPROVE_OPTION) {
			save(jFileChooser1.getSelectedFile());
		}
	}
	
	/** Save file with specified File instance */
	private void save(File file) {
		try {
			// Write the text in jta to the specified file
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream(file));
			
			byte[] b = (jta.getText()).getBytes();
			out.write(b, 0, b.length);
			out.close();
			
			// Display the status of the save file operating in jlblStatus
			jlblStatus.setText(file.getName() + " Saved");
		} catch (IOException ex) {
			jlblStatus.setText("Error saving " + file.getName());
		}
	}
}
