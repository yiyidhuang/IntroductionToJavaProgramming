import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class ShowDiagonalLayout extends JApplet {
	private FlowLayout flowLayout = new FlowLayout();
	private GridLayout gridLayout = new GridLayout(2, 2);
	private DiagonalLayout diagonalLayout = new DiagonalLayout();
	
	
	private JButton jbt1 = new JButton("Button 1");
	private JButton jbt2 = new JButton("Button 2");
	private JButton jbt3 = new JButton("Button 3");
	private JButton jbt4 = new JButton("Button 4");
	
	private JRadioButton jrbFlowLayout = new JRadioButton("FlowLayout");
	private JRadioButton jrbGridLayout = new JRadioButton("GridLayout");
	private JRadioButton jrbDiagonalLayout = new JRadioButton("DiagonalLayout", true);
	
	private JPanel jPanel2 = new JPanel();
	
	public void ShowDigonalLayout() {
		// Set default layout in jPanel2
		jPanel2.setLayout(diagonalLayout);
		jPanel2.add(jbt1);
		jPanel2.add(jbt2);
		jPanel2.add(jbt3);
		jPanel2.add(jbt4);
		
		jPanel2.setBorder(new LineBorder(Color.black));
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setBorder(new TitledBorder("Select a Layout Manager"));
		jPanel1.add(jrbFlowLayout);
		jPanel1.add(jrbGridLayout);
		jPanel1.add(jrbDiagonalLayout);
		
		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(jrbFlowLayout);
		buttonGroup1.add(jrbGridLayout);
		buttonGroup1.add(jrbDiagonalLayout);
		
		add(jPanel1, BorderLayout.SOUTH);
		add(jPanel2, BorderLayout.CENTER);
		
		jrbFlowLayout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jPanel2.setLayout(flowLayout);
				jPanel2.revalidate();
			}
		});
		
		jrbGridLayout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jPanel2.setLayout(gridLayout);
				jPanel2.revalidate();
			}
		});
		
		jrbDiagonalLayout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jPanel2.setLayout(diagonalLayout);
				jPanel2.revalidate();
			}
		});
	}
}
