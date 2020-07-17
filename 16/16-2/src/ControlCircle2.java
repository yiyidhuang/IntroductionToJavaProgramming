import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ControlCircle2 extends JFrame {
	private JButton jbtEnlarge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();
	
	public ControlCircle2() {
		JPanel panel = new JPanel(); // Use the panel to group buttons
		panel.add(jbtEnlarge);
		panel.add(jbtShrink);
		
		this.add(canvas, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
		
		jbtEnlarge.addActionListener(new EnlargeListener());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new ControlCircle2();
		frame.setTitle("ControlCircle2");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

	class EnlargeListener implements ActionListener { // Inner class
		public void actionPerformed(ActionEvent e) {
			canvas.enlarge();
		}
	}
	
	class CirclePanel extends JPanel { // Inner class
		private int radius = 5; // Default circle radius
		
		/** Enlarge the circle */
		public void enlarge() {
			radius ++;
			
			repaint();
		}
		
		/** Repaint the circle */
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
		}
	}
}
