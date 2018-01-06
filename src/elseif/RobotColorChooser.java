
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		Robot r2d2 = new Robot();
		for (int i = 0; i < 100; i++) {
		r2d2.setPenWidth(100);
		//3. ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw?");
		//4. use an if/else statement to set the pen color that the user requested
		
		if(color.equals("blue")) {
			r2d2.setPenColor(0, 0, 250);
		}
		else if(color.equals("red")) {
			r2d2.setPenColor(250, 0, 0);
		}
		else if(color.equals("green")) {
			r2d2.setPenColor(0, 250, 0);
		}
        //5. if the user doesn’t enter anything, choose a random color
		else {
			r2d2.setRandomPenColor();
		}
		r2d2.penDown();
		r2d2.move(100);
		}
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)


	}
}
