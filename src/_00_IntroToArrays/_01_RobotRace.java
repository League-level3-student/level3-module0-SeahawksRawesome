package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main( String [] args) {
		
	
		//2. create an array of 5 robots.
			Robot[] robotList = new Robot[5];
		//3. use a for loop to initialize the robots.
			for(int i = 0; i < robotList.length; i++) {
				robotList[i] = new Robot();
			}
		//4. make each robot start at the bottom of the screen, side by side, facing up
			robotList[0].setX(50);
			robotList[0].setY(550);
			robotList[1].setX(150);
			robotList[1].setY(550);
			robotList[2].setX(250);
			robotList[2].setY(550);
			robotList[3].setX(350);
			robotList[3].setY(550);
			robotList[4].setX(450);
			robotList[4].setY(550);
			
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
			Random rand = new Random();
			
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
			while(robotList[0].getY() > 50 || robotList[1].getY() > 50 || robotList[2].getY() > 50 || robotList[3].getY() > 50 || robotList[4].getY() > 50) {
				for(int i = 0; i < robotList.length; i++) {
					robotList[i].setSpeed(10);
					robotList[i].move(rand.nextInt(50));
				}
			}
		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
