import java.awt.BorderLayout;

import javax.swing.JApplet;
import javax.swing.JTabbedPane;

public class DisplayFigure extends JApplet {
	private JTabbedPane jtpFigures = new JTabbedPane();
	private FigurePanel squarePanel = new FigurePanel();
	private FigurePanel rectanglePanel = new FigurePanel();
	private FigurePanel circlePanel = new FigurePanel();
	private FigurePanel ovalPanel = new FigurePanel();
	
	public DisplayFigure() {
		squarePanel.setType(FigurePanel.LINE);
		rectanglePanel.setType(FigurePanel.RECTANGLE);
		circlePanel.setType(FigurePanel.ROUND_RECTANGLE);
		ovalPanel.setType(FigurePanel.OVAL);
		
		add(jtpFigures, BorderLayout.CENTER);
		jtpFigures.add(squarePanel, "Line");
		jtpFigures.add(rectanglePanel, "Rectangle");
		jtpFigures.add(circlePanel, "Round Rectangle");
		jtpFigures.add(ovalPanel, "Oval");
		
		jtpFigures.setToolTipTextAt(0, "Square");
		jtpFigures.setToolTipTextAt(1, "Rectangle");
		jtpFigures.setToolTipTextAt(2, "Circle");
		jtpFigures.setToolTipTextAt(3, "Oval");
	}
}
