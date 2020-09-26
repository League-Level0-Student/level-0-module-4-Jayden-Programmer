package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************ SLEEPY HEAD **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
		String Day = JOptionPane.showInputDialog(null, "What day is it?");
		// Set the boolean isWeekend based on the value they enter
		if (Day.equals("sunday") || Day.equals("saturday")) {
			isWeekend = true;
		} else {
			isWeekend = false;
		}

		// If it is the weekend, tell the user they get to sleep in.
		if (isWeekend) {
			JOptionPane.showMessageDialog(null, "you get to sleep in!");
		}
		// If it is not the weekend, tell them to get out of bed and go to school!
		else {
			JOptionPane.showMessageDialog(null, "Get out of bed and go to school!");
		}

		/************************ STAR STUDENT **************************/

		boolean passedExam = false;
		// Write code to ask the user what percentage they scored in their last exam
		String Test = JOptionPane.showInputDialog(null, "What score did you get on your last test?");
		double tesla = Double.parseDouble(Test);

		// If they scored more than 70, they passed the exam.
		if (tesla > 70) {
			passedExam = true;

		}

		
		
		
		
		
		
		
		
		
		
		
		
		
				// Set the boolean passedExam based on their score.
		if (passedExam) {
			JOptionPane.showMessageDialog(null, "this is your score");
		}
		// If the user passed the exam, congratulate them
		else {
			JOptionPane.showMessageDialog(null, "You passed but, your still very dumb");
		}

		// otherwise, wish them better luck next time.

		/************************ GAME OVER **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over.
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;

			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over"

		/*********************** RED SQUARE ********************/

		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed
		// variable

		boolean isSquare;
		// Now ask the user what shape to draw. Based on their answer, set the isSquare
		// variable

		// Now you MUST use the && operator to join the booleans for this code.
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use
		// the method below)
		// otherwise, tell the user you don't know how to draw that shape

	}

	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
	}
}
