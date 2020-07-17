import java.awt.BorderLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class ScrollBarDemo extends JFrame {
	// Create horizontal and vertical scroll bars
	private JScrollBar jscbHort = 
			new JScrollBar(JScrollBar.HORIZONTAL);			
	private JScrollBar jscbVert = 
			new JScrollBar(JScrollBar.VERTICAL);
	
	// Create a MessagePanel
	private MessagePanel messagePanel = 
			new MessagePanel("Welcome to Java");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScrollBarDemo frame = new ScrollBarDemo();
		frame.setTitle("ScrollBarDemo");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public ScrollBarDemo() {
		// Add scroll bars and message panel to the frame
		setLayout(new BorderLayout());
		add(messagePanel, BorderLayout.CENTER);
		add(jscbVert, BorderLayout.EAST);
		add(jscbHort, BorderLayout.SOUTH);
		
		// Register listener for the scroll bars
		jscbHort.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				// getValue() and getMaximumVal() return int, but for better
				// precision, use double
				double value = jscbHort.getValue();
				double maximumValue = jscbHort.getMaximum();
				double newX = (value * messagePanel.getWidth() / maximumValue);
				messagePanel.setXCoordinate((int)newX);
			}
		});
		
		jscbVert.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				// getValue() and getmaximumValue() return int, but for better
				// precision, use double
				double value = jscbVert.getValue();
				double maximumValue = jscbVert.getMaximum();
				double newY = (value * messagePanel.getHeight() / maximumValue);
				messagePanel.setYCoordinate((int)newY);
			}
		});
	}
}
