package assignment_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

final class EventHandler extends Calculator {
	double resultNum;
	int num = 0;
	String displayHolder = "";
	String[] holder = new String[100];
	EventHandler() {
		actionListener();
	}
	public void actionListener() {
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				if(display.getText().equals("0")) {
					display.setText("1");
					displayHolder = displayHolder + "1";
				} else {
					display.setText(display.getText() + "1");
					displayHolder = displayHolder + "1";
				}
			}
			
		});
		btn2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				if(display.getText().equals("0")) {
					display.setText("2");
					displayHolder = displayHolder + "2";
				} else {
					display.setText(display.getText() + "2");
					displayHolder = displayHolder + "2";
				}
			}
			
		});
		btn3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				if(display.getText().equals("0")) {
					display.setText("3");
					displayHolder = displayHolder + "3";
				} else {
					display.setText(display.getText() + "3");
					displayHolder = displayHolder + "3";
				}
			}
			
		});
		btn4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				if(display.getText().equals("0")) {
					display.setText("4");
					displayHolder = displayHolder + "4";
				} else {
					display.setText(display.getText() + "4");
					displayHolder = displayHolder + "4";
				}
			}
			
		});
		btn5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				if(display.getText().equals("0")) {
					display.setText("5");
					displayHolder = displayHolder + "5";
				} else {
					display.setText(display.getText() + "5");
					displayHolder = displayHolder + "5";
				}
			}
			
		});
		btn6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				if(display.getText().equals("0")) {
					display.setText("6");
					displayHolder = displayHolder + "6";
				} else {
					display.setText(display.getText() + "6");
					displayHolder = displayHolder + "6";
				}
			}
			
		});
		btn7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				if(display.getText().equals("0")) {
					display.setText("7");
					displayHolder = displayHolder + "7";
				} else {
					display.setText(display.getText() + "7");
					displayHolder = displayHolder + "7";
				}
			}
			
		});
		btn8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				if(display.getText().equals("0")) {
					display.setText("8");
					displayHolder = displayHolder + "8";
				} else {
					display.setText(display.getText() + "8");
					displayHolder = displayHolder + "8";
				}
			}
			
		});
		btn9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				if(display.getText().equals("0")) {
					display.setText("9");
					displayHolder = displayHolder + "9";
				} else {
					display.setText(display.getText() + "9");
					displayHolder = displayHolder + "9";
				}
			}
			
		});
		btn0.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				if(display.getText().equals("0")) {
					display.setText("0");
					displayHolder = displayHolder + "0";
				} else {
					display.setText(display.getText() + "0");
					displayHolder = displayHolder + "0";
				}
			}
			
		});
		btnA.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				display.setText(display.getText() + "+");
				holder[num] = displayHolder;
				holder[num+1] = "+";
				displayHolder = "";
				num = num + 2;
			}
			
		});
		btnS.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				display.setText(display.getText() + "-");
				holder[num] = displayHolder;
				holder[num+1] = "-";
				displayHolder = "";
				num = num + 2;
			}
			
		});
		btnM.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				display.setText(display.getText() + "*");
				holder[num] = displayHolder;
				holder[num+1] = "*";
				displayHolder = "";
				num = num + 2;
			}
			
		});
		btnD.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				display.setText(display.getText() + "/");
				holder[num] = displayHolder;
				holder[num+1] = "/";
				displayHolder = "";
				num = num + 2;
			}
			
		});
		btnC.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				display.setText("");
				resultNum = 0;
				num = 0;
				displayHolder = "";
				for(int i = 0; i < holder.length; i++) {
					holder[i] = "";
				}
			}
			
		});
		btnE.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				holder[num] = displayHolder;
				for(int i = 0; i < holder.length; i++) {
					if(holder[i] == null) {
						break;		
					} else {
						switch(holder[i]) {
						case "+":
							resultNum = Double.parseDouble(holder[i-1]) + Double.parseDouble(holder[i+1]);
							holder[i+1] = Double.toString(resultNum);
							break;
						case "-":
							resultNum = Double.parseDouble(holder[i-1]) - Double.parseDouble(holder[i+1]);
							holder[i+1] = Double.toString(resultNum);
							break;
						case "*":
							resultNum = Double.parseDouble(holder[i-1]) * Double.parseDouble(holder[i+1]);
							holder[i+1] = Double.toString(resultNum);
							break;
						case "/":
							resultNum = Double.parseDouble(holder[i-1]) / Double.parseDouble(holder[i+1]);
							holder[i+1] = Double.toString(resultNum);
							break;
						}
					}
				}
				DecimalFormat nf = new DecimalFormat("##.##");
				display.setText((nf.format(resultNum)));
				num = 0;
				displayHolder = Double.toString(resultNum);
			}
		});
	}
	
}
