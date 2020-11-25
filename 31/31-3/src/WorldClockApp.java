import javax.swing.JApplet;
import javax.swing.JFrame;

public class WorldClockApp extends JApplet {
	public WorldClockApp() {
		add(new WorldClockControl());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorldClockApp applet = new WorldClockApp();
		JFrame frame = new JFrame("WorldClockApp");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(applet, java.awt.BorderLayout.CENTER);
		frame.setSize(400, 320);
		frame.setVisible(true);
	}
}
