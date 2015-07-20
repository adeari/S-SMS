package sms.apps.frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainFrame {
	public static boolean RIGHT_TO_LEFT = false;

	public static void addComponentsToPane(Container pane) {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		pane.add(mainPanel);

		JButton button = new JButton("Button 1 (PAGE_START)");
		mainPanel.add(button, BorderLayout.PAGE_START);

		// Make the center component big, since that's the
		// typical usage of BorderLayout.
		button = new JButton("Button 2 (CENTER)");
		mainPanel.add(button, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setPreferredSize(new Dimension(200, 0));
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		JMenuBar menuBar = new JMenuBar();
		JMenu fileJMenu = new JMenu("aaaa");
		fileJMenu.setPreferredSize(new Dimension(400, 40));
		menuBar.add(fileJMenu);
		panel.add(menuBar);
		for (int i = 0; i < 20; i++) {
			menuBar = new JMenuBar();
			fileJMenu = new JMenu("aaaa " + i);
			fileJMenu.setPreferredSize(new Dimension(400, 40));
			menuBar.add(fileJMenu);
			panel.add(menuBar);
		}

		mainPanel.add(scrollPane, BorderLayout.LINE_START);

	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event dispatch thread.
	 */
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("BorderLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addComponentsToPane(frame.getContentPane());
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		/* Use an appropriate Look and Feel */
		try {
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		/* Turn off metal's use bold fonts */
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		// Schedule a job for the event dispatch thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}