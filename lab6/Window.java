package lab6;
import java.awt.*;
import javax.swing.*;
public class Window {
	JFrame frame;
	JPanel fieldPanel;
	JPanel labelPanel;
	JPanel buttonPanel;
	JTextField field1;
	JTextField field2;
	JLabel label;
	JButton button;
	Window() {
		makeWindow();
	}
	public void makeWindow() {
		frame = new JFrame("Lab 6");
		fieldPanel = new JPanel();
		labelPanel = new JPanel();
		buttonPanel = new JPanel();
		field1 = new JTextField("0", 5);
		field2 = new JTextField("0", 5);
		label = new JLabel("0");
		button = new JButton("Add");
		
		frame.setVisible(true);
		frame.setSize(300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fieldPanel.add(field1);
		fieldPanel.add(field2);
		labelPanel.add(label);
		buttonPanel.add(button);
		frame.add(fieldPanel, BorderLayout.WEST);
		frame.add(labelPanel, BorderLayout.EAST);
		frame.add(buttonPanel, BorderLayout.SOUTH);
	}
}
