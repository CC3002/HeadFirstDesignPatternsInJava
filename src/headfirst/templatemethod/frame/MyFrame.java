package headfirst.templatemethod.frame;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

	/**
   * 
   */
  private static final long serialVersionUID = -6958746263936844089L;

  public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setSize(300,300);
		this.setVisible(true);
	}

	public void paint(Graphics graphics) {
		super.paint(graphics);
		String msg = "I rule!!";
		graphics.drawString(msg, 100, 100);
	}

	public static void main(String[] args) {
		new MyFrame("Head First Design Patterns");
	}
}
