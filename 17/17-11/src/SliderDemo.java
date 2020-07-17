import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo extends JFrame {
	// Create horizontal and vertical sliders
	private JSlider jsldHort = new JSlider(JSlider.HORIZONTAL);
	private JSlider jsldVert = new JSlider(JSlider.VERTICAL);
	
	// Create a MesasgePanel
	private MessagePanel messagePanel = 
			new MessagePanel("Welcome to Java");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SliderDemo frame =new SliderDemo();
		frame.setTitle("SliderDemo");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public SliderDemo() {
		// Add sliders and message panel to the frame
		setLayout(new BorderLayout(5, 5));
		add(messagePanel, BorderLayout.CENTER);
		add(jsldVert, BorderLayout.EAST);
		add(jsldHort, BorderLayout.SOUTH);
		
		// Set properties for sliders
		jsldHort.setMaximum(50);
		jsldHort.setPaintLabels(true);
		jsldHort.setPaintTicks(true);
		jsldHort.setMajorTickSpacing(10);
		jsldHort.setMinorTickSpacing(1);
		jsldHort.setPaintTrack(false);
		jsldVert.setInverted(true);
		jsldVert.setMaximum(10);
		jsldVert.setPaintLabels(true);
		jsldVert.setPaintTicks(true);
		jsldVert.setMajorTickSpacing(10);
		jsldVert.setMinorTickSpacing(1);
		
		// Register listener for the sliders
		jsldHort.addChangeListener(new ChangeListener() {
			/** Handle scroll-bar adjustment actions */
			public void stateChanged(ChangeEvent e) {
				// getValue() and getMaximumValue() return int, but for better
				// precision, use double
				double value = jsldHort.getValue();
				double maximumValue = jsldHort.getValue();
				double newX = (value * messagePanel.getWidth() / maximumValue);
				messagePanel.setXCoordinate((int)newX);
			}
		});
		
		jsldVert.addChangeListener(new ChangeListener() {
			/** Handle scroll-bar adjustment actions */
			public void stateChanged(ChangeEvent e) {
				// getValue() and getMaximumValue() return int, but for better
				// precision, use double
				double value = jsldVert.getValue();
				double maximumValue = jsldVert.getMaximum();
				double newY = (value * messagePanel.getHeight() / maximumValue);
				messagePanel.setYCoordinate((int)newY);
			}
		});
	}
}
