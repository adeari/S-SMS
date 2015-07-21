package testing.sms.apps.accordionmenu;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;


public class ArrowPanel extends JPanel implements SwingConstants{

protected int direction;

private Color shadow;
private Color darkShadow;
private Color highlight;

public ArrowPanel(int direction) {
 this(direction, UIManager.getColor("control"), UIManager
   .getColor("controlShadow"), UIManager
   .getColor("controlDkShadow"), UIManager
   .getColor("controlLtHighlight"));
}

public ArrowPanel(int direction, Color background, Color shadow,
  Color darkShadow, Color highlight) {
 super();
 setRequestFocusEnabled(false);
 setDirection(direction);
 setBackground(background);
 this.shadow = shadow;
 this.darkShadow = darkShadow;
 this.highlight = highlight;
}

/**
 * Returns the direction of the arrow.
 *
 * @param direction
 *            the direction of the arrow; one of {@code
 *            SwingConstants.NORTH}, {@code SwingConstants.SOUTH}, {@code
 *            SwingConstants.EAST} or {@code SwingConstants.WEST}
 */
public int getDirection() {
 return direction;
}

/**
 * Sets the direction of the arrow.
 *
 * @param direction
 *            the direction of the arrow; one of of {@code
 *            SwingConstants.NORTH}, {@code SwingConstants.SOUTH}, {@code
 *            SwingConstants.EAST} or {@code SwingConstants.WEST}
 */
public void setDirection(int dir) {
 direction = dir;
}

public void paint(Graphics g) {
}

public void changeDirection(int d) {
 setDirection(d);
}

}