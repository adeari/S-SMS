package sms.apps.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JLabel;

public class LabelTitle extends JLabel {
	private static final long serialVersionUID = 3183570784117983799L;
	public LabelTitle(String title, Icon icon) {
		this.setText(title);
		this.setFont(new Font(null, Font.BOLD, 17));
		this.setIcon(icon);
		this.setPreferredSize(new Dimension(500, 30));
		this.setBackground(Color.GREEN);
		this.setOpaque(true);
	}
}