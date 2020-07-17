import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayImage extends JFrame {

	public DisplayImage() {
		add(new ImagePanel());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new DisplayImage();
		frame.setTitle("DisplayImage");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class ImagePanel extends JPanel {
	private ImageIcon imageIcon = new ImageIcon("image/us.gif");
	private Image image = imageIcon.getImage();
	
	/** Draw image on the panel */
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (image != null) {
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		}
	}
}
