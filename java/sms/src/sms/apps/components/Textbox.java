package sms.apps.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class Textbox extends JTextField {
	private static final long serialVersionUID = -2686295811222694572L;

	public Textbox() {
		this.setFont(new Font(null, Font.PLAIN, 15));
		this.setPreferredSize(new Dimension(350, 30));
		this.addFocusListener(new FocusListener() {

			public void focusGained(FocusEvent e) {
				setBackground(Color.YELLOW);
			}

			public void focusLost(FocusEvent e) {
				setBackground(null);
			}
		});
	}
}
