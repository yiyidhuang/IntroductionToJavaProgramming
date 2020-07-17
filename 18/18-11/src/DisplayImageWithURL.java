import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;

public class DisplayImageWithURL extends JApplet {
	public DisplayImageWithURL() {
		java.net.URL url = this.getClass().getResource("image/us.gif");
		add(new JLabel(new ImageIcon(url)));
	}
}
