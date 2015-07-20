package sms.apps.components;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrameCustom extends JFrame {
	private static final long serialVersionUID = -4835609933006488848L;

	public FrameCustom(String title, boolean isExitOnClose) {
		this.setTitle(title);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		if (isExitOnClose) {
			this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			this.addWindowListener(new java.awt.event.WindowAdapter() {
				@Override
				public void windowClosing(java.awt.event.WindowEvent windowEvent) {
					if (JOptionPane.showConfirmDialog(windowEvent.getComponent(),
							"Ingin menutup aplikasi ?",
							"Menghentikan aplikasi ?", JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
				}
			});
		} else {
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
	}
}
