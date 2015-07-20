package sms.apps.components;

import java.awt.Font;

import javax.swing.JButton;

public class ButtonCustom extends JButton {
	private static final long serialVersionUID = 7112911658618908010L;
	public ButtonCustom(String title) {
		this.setText(title);
		this.setFont(new Font(null, Font.PLAIN, 40));
	}

}
