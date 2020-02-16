// Sam Ballard

package lab5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

final class EventHandler extends Window {
	EventHandler() {
		actionListener();
	}
	public void actionListener() {
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Button 1 works");
			}
			
		});
		button1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Button 2 works");
			}
			
		});
		button2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Button 3 works");
			}
			
		});
		button3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Button 4 works");
			}
			
		});
		button4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Button 5 works");
			}
			
		});
		button5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Button 6 works");
			}
			
		});
	}
}
