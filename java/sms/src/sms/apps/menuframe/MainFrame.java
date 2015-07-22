package sms.apps.menuframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import sms.apps.kontak.KontakTambah;
import sms.apps.menuframe.components.ButtonHeaderMenu;
import sms.apps.menuframe.components.ButtonLeftMenu;
import sms.apps.menuframe.components.LabelLeftMenu;

public class MainFrame {

	private static JPanel centerPane;
	private static JFrame frame;
	private static JComboBox lookAndFeelBox;

	public static void addComponentsToPane(Container pane) {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		pane.add(mainPanel);

		JPanel centerJPanel = new JPanel();
		centerJPanel.setLayout(new BorderLayout());

		JPanel headerMenu = new JPanel();
		headerMenu.setBackground(Color.LIGHT_GRAY);

		ButtonHeaderMenu tambahKontak = new ButtonHeaderMenu(
				"Tambah kontak",
				new ImageIcon(MainFrame.class.getResource("icon/addpeople.png")));
		tambahKontak.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				centerPane.removeAll();
				centerPane.add(new KontakTambah("Tambah kontak", new ImageIcon(
						MainFrame.class.getResource("icon/addpeople.png"))));
				centerPane.validate();
				centerPane.repaint();
			}
		});
		headerMenu.add(tambahKontak);

		ButtonHeaderMenu smsPerKontak = new ButtonHeaderMenu(
				"Kirim SMS per kontak", new ImageIcon(
						MainFrame.class.getResource("icon/smsperorang.png")));
		headerMenu.add(smsPerKontak);

		ButtonHeaderMenu smsMassal = new ButtonHeaderMenu(
				"Kirim SMS massal",
				new ImageIcon(MainFrame.class.getResource("icon/smsmassal.png")));
		headerMenu.add(smsMassal);

		ButtonHeaderMenu smsReminder = new ButtonHeaderMenu(
				"Kirim SMS reminder", new ImageIcon(
						MainFrame.class.getResource("icon/bell.png")));
		headerMenu.add(smsReminder);

		JLabel themeJLabel = new JLabel("     Theme");
		themeJLabel.setFont(new Font(null, Font.BOLD, 15));
		headerMenu.add(themeJLabel);
		lookAndFeelBox = new JComboBox(new String[]{ "Metal", "Motif", "Windows", "Nimbus", "Good" });
		lookAndFeelBox.setFont(new Font(null, Font.PLAIN, 15));
		lookAndFeelBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				try {
					String valueLookAndFeel = lookAndFeelBox.getSelectedItem()
							.toString();
					if (valueLookAndFeel.equalsIgnoreCase("Windows")) {
						UIManager
								.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					} else if (valueLookAndFeel.equalsIgnoreCase("Metal")) {
						UIManager
								.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
					} else if (valueLookAndFeel.equalsIgnoreCase("Motif")) {
						UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
					} else if (valueLookAndFeel.equalsIgnoreCase("Nimbus")) {
						UIManager
						.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					} else if (valueLookAndFeel.equalsIgnoreCase("Good")) {
						UIManager
						.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName());
					}
					SwingUtilities.updateComponentTreeUI(frame);
				} catch (UnsupportedLookAndFeelException ex) {
					ex.printStackTrace();
				} catch (IllegalAccessException ex) {
					ex.printStackTrace();
				} catch (InstantiationException ex) {
					ex.printStackTrace();
				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				}
			}

		});
		headerMenu.add(lookAndFeelBox);

		centerJPanel.add(headerMenu, BorderLayout.PAGE_START);
		centerPane = new JPanel();
		centerPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		centerJPanel.add(centerPane, BorderLayout.CENTER);

		mainPanel.add(centerJPanel, BorderLayout.CENTER);

		JPanel menuPanel = new JPanel();
		menuPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		menuPanel.setPreferredSize(new Dimension(250, 0));
		JScrollPane menuScrollPane = new JScrollPane(menuPanel);
		mainPanel.add(menuScrollPane, BorderLayout.LINE_START);
		menuScrollPane
				.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		LabelLeftMenu smsMenu = new LabelLeftMenu("S M S Menu");
		menuPanel.add(smsMenu);

		ButtonLeftMenu inboxSmsButton = new ButtonLeftMenu("SMS Masuk (Inbox)",
				new ImageIcon(MainFrame.class.getResource("icon/email.png")));
		menuPanel.add(inboxSmsButton);

		ButtonLeftMenu outboxSmsButton = new ButtonLeftMenu(
				"SMS Tertunda (Outbox)", new ImageIcon(
						MainFrame.class.getResource("icon/emailtertunda.png")));
		menuPanel.add(outboxSmsButton);

		ButtonLeftMenu draftSmsButton = new ButtonLeftMenu(
				"SMS Sementara (Draftbox)", new ImageIcon(
						MainFrame.class.getResource("icon/draftsms.png")));
		menuPanel.add(draftSmsButton);

		ButtonLeftMenu sendSmsButton = new ButtonLeftMenu(
				"SMS Terkirim (Sendbox)", new ImageIcon(
						MainFrame.class.getResource("icon/sendemail.png")));
		menuPanel.add(sendSmsButton);

		LabelLeftMenu kontakLabel = new LabelLeftMenu("Daftar kontak");
		menuPanel.add(kontakLabel);

		ButtonLeftMenu daftarKontak = new ButtonLeftMenu("Daftar kontak",
				new ImageIcon(MainFrame.class.getResource("icon/people.png")));
		menuPanel.add(daftarKontak);

		LabelLeftMenu pengaturanLabel = new LabelLeftMenu("Pengaturan");
		menuPanel.add(pengaturanLabel);

		ButtonLeftMenu konfigurasiModemButton = new ButtonLeftMenu(
				"Konfigurasi modem", new ImageIcon(
						MainFrame.class.getResource("icon/modem.png")));
		menuPanel.add(konfigurasiModemButton);
	}

	private static void createAndShowGUI() {
		frame = new JFrame("BorderLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addComponentsToPane(frame.getContentPane());
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
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
		createAndShowGUI();
	}
}