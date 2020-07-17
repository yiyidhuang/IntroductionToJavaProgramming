import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class ClockAnimation extends JFrame {
	private StillClock clock = new StillClock();
	
	public ClockAnimation() {
		add(clock);
		
		// Create a timer with dielay 1000ms
		Timer timer = new Timer(1000, new TimerListener());
		timer.start();
	}
	
	private class TimerListener implements ActionListener {
		/** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			// Set new time and repaint the clock to display current time
			clock.setCurrentTime();
			clock.repaint();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new ClockAnimation();
		frame.setTitle("ClockAnimation");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
