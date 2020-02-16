// Sam Ballard

package lab5;
import java.awt.*;
import javax.swing.*;

public class Window {
	Window() {
		makeWindow();
	}
	JFrame frame;
	JPanel panel;
	JPanel panel1;
	JButton button;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	
	public void makeWindow() {
		frame = new JFrame("Lab_5");
		frame.setVisible(true);
		frame.setSize(700, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel1 = new JPanel();
		panel1.setBackground(Color.black);
		panel.setBackground(Color.black);
		button = new JButton("Button 1");
		button1 = new JButton("Button 2");
		button2 = new JButton("Button 3");
		button3 = new JButton("Button 4");
		button4 = new JButton("Button 5");
		button5 = new JButton("Button 6");
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		frame.add(panel1);
		frame.add(panel, BorderLayout.PAGE_END);
	}
}
