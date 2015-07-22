package sms.apps.menuframe.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LabelLeftMenu extends JLabel {
	private static final long serialVersionUID = 3475621446565235182L;

	public LabelLeftMenu(String title) {
		this.setText(title);
		this.setFont(new Font(null, Font.BOLD, 17));
		this.setBackground(Color.BLUE);
		this.setForeground(Color.WHITE);
		this.setOpaque(true);
		this.setPreferredSize(new Dimension(250, 40));
		Border paddingBorder = BorderFactory.createEmptyBorder(10,10,10,10);
		Border border = BorderFactory.createLineBorder(null);
		this.setBorder(BorderFactory.createCompoundBorder(border,paddingBorder));
	}
}
