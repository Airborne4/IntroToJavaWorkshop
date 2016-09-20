package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		int x=2;
		Robot bastion=new Robot();
		for (int i = 0; i < 4; i++) {
			
		
	bastion.setPenColor(0, 0, 255);
			bastion.penDown();
			bastion.sparkle();
		bastion.setSpeed(15);
		bastion.move(500);
		bastion.turn(90);
		
	
		}
		
		

	
		
		
	}
}
