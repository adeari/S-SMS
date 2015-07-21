package sms.apps.menuframe.components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.Icon;
import javax.swing.JButton;

public class ButtonLeftMenu extends JButton {
	private static final long serialVersionUID = -2738896119850464359L;

	public ButtonLeftMenu(String title, Icon icon) {
		this.setText(title);
		this.setIcon(icon);
		this.setFont(new Font(null, Font.BOLD, 15));
		this.setPreferredSize(new Dimension(250, 20));
		this.setHorizontalAlignment(LEFT);
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.addFocusListener(focusListener);
	}
	
	private FocusListener focusListener = new FocusListener() {

        public void focusGained(FocusEvent e) {
        	setBackground(Color.ORANGE);
            setForeground(Color.BLUE);
            
        }

        public void focusLost(FocusEvent e) {
        	setBackground(new JButton().getBackground());
            setForeground(Color.BLACK);
            
        }
    };
}
