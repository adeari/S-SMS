package sms.apps.components;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

public class LabelCustom extends JLabel {
	private static final long serialVersionUID = 3183570784117983799L;
	public LabelCustom(String title) {
		this.setText(title);
		this.setFont(new Font(null, Font.PLAIN, 15));
		this.setPreferredSize(new Dimension(100, 30));
	}
}
