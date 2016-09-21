package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String name= JOptionPane.showInputDialog("What is your name buddy...");
	String answer1= JOptionPane.showInputDialog("Tell me your credit card number");
	JOptionPane.showMessageDialog(null, answer1);
	JOptionPane.showInputDialog(answer1+"Tell me your name");
	
	
}
}
