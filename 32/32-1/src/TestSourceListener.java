import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestSourceListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("TestSourceListener");
		
		// Create a source object
		JButton jbt = new JButton("OK");
		frame.add(jbt);
		frame.setSize(200, 200);
		frame.setVisible(true);
		
		// Create listener
		MyListener listener = new MyListener();
		
		// Register listener
		jbt.addActionListener(listener);
	}

}

/** MyListener class */
class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("I Will process it!");
	}
}
