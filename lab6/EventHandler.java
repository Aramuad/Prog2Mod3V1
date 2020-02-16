package lab6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

final class EventHandler extends Window {
	EventHandler() {
		actionListener();
	}
	public void actionListener() {
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(field1.getText());
				int num2 = Integer.parseInt(field2.getText());
				String output = Integer.toString(num1 + num2);
				label.setText(output);;
			}
			
		});
	}
	
}
