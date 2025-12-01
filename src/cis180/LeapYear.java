package cis180;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LeapYear extends JFrame implements ActionListener {
	
	private JLabel input = new JLabel ("Input a year and press enter");
	private JLabel label = new JLabel ("");
	private JTextField leap = new JTextField (4);
	
	public LeapYear (){
			super ("Leap Year");
			this.setSize(300,125);
			JPanel panel = new JPanel();
			panel.setLayout(new FlowLayout());
			panel.add(input);
			panel.add(leap);
			this.add(panel);
			this.setLayout(new GridLayout (2,1));
			this.add(label);
			label.setHorizontalAlignment(JLabel.CENTER);
			leap.addActionListener(this);
			setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		new LeapYear();
	}

	public void actionPerformed(ActionEvent arg0){
		int year;
		year = Integer.parseInt (leap.getText());
		if (year%4==0)
			if (year%100!=0)
				label.setText(year + " is a leap year");
			else if (year%400==0)
				label.setText(year + " is a leap year");
			else 
				label.setText(year + " is not a leap year");
		else
			label.setText(year + " is not a leap year");
		
	
	}

}
