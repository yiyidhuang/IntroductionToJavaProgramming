import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class CalendarApp extends JApplet {
	// Create a CalendarPanel for showing calendars
	private CalendarPanel calendarPanel = new CalendarPanel();
	
	// Combox box for selecting available locales
	private JComboBox jcboLocale = new JComboBox();
	
	// Declare locales to store available locales
	private Locale[] locales = Calendar.getAvailableLocales();

	// Buttons Prior and Next for displaying rpior and next month
	private JButton jbtPrior = new JButton("Prior");
	private JButton jbtNext = new JButton("Next");
	
	/** Intitialize the applet */
	public void init() {
		// Panel jpLocale to hold the combo box for selecting locales
		JPanel jpLocale = new JPanel(new FlowLayout());
		jpLocale.setBorder(new TitledBorder("Choose a locale"));
		jpLocale.add(jcboLocale);
		
		// Initialize the combo box to add locale names
		for (int i = 0; i < locales.length; i ++) {
			jcboLocale.addItem(locales[i].getDisplayName());
		}
		
		// Panel jpButtons to hold buttons
		JPanel jpButtons = new JPanel(new FlowLayout());
		jpButtons.add(jbtPrior);
		jpButtons.add(jbtNext);
		
		// Panel jpCalendar to hold calendarPanel and buttons
		JPanel jpCalendar = new JPanel(new BorderLayout());
		jpCalendar.add(calendarPanel, BorderLayout.CENTER);
		jpCalendar.add(jpButtons, BorderLayout.SOUTH);
		
		// Place jpCalendar and jpLocale to the applet
		add(jpCalendar, BorderLayout.CENTER);
		add(jpLocale, BorderLayout.SOUTH);
		
		// Register listeners
		jcboLocale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jcboLocale) {
					calendarPanel.changeLocale(locales[jcboLocale.getSelectedIndex()]);
				}
			}
		});
		
		jbtPrior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentMonth = calendarPanel.getMonth();
				if (currentMonth == 0) {  // The previous month is 11 for Dec
					calendarPanel.setYear(calendarPanel.getYear() - 1);
				}					
				calendarPanel.setMonth((currentMonth - 1) % 12);
			}
		});
		
		jbtNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentMonth = calendarPanel.getMonth();
				if (currentMonth == 11) {  // The next month is 0 for Jan
					calendarPanel.setYear(calendarPanel.getYear() + 1);
				}
				calendarPanel.setMonth((currentMonth + 1) % 12);
			}
		});
		
		calendarPanel.changeLocale(locales[jcboLocale.getSelectedIndex()]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a frame
		JFrame frame = new JFrame("CalendarApp");
		
		// Create an instance of the applet
		CalendarApp applet = new CalendarApp();
		
		// Add the applet instance to the frame
		frame.getContentPane().add(applet, BorderLayout.CENTER);
		
		// Invoke init() and start();
		applet.init();
		applet.start();
		
		// Display the frame
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
