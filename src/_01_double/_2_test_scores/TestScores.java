package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String Test = JOptionPane.showInputDialog(null, "What is your test score?");
		
		double tesla=Double.parseDouble(Test);
		
		
		if (tesla == 100) { 
		JOptionPane.showMessageDialog(null, "Wow! you must really be studying for that test! Good job! ");
		} 
		
		double testsa=Double.parseDouble(Test);
		 
		
		if (testsa == 90) { 
		JOptionPane.showMessageDialog(null, "Wow! you must really be studying for that test! Good job! ");	
		}
		 
		if(testsa==80) { 
		JOptionPane.showMessageDialog(null, "Not bad good job!");
		}
		
		if(testsa==70) {
		JOptionPane.showMessageDialog(null, "Thats a little below average but thats ok");
		}
		
		if(testsa==60) { 
		JOptionPane.showMessageDialog(null, "Thats garbage how is that possible");
		}
		
		if(testsa==50) { 
		JOptionPane.showMessageDialog(null, "Your stupid");
		}
		
		if(testsa==40) { 
		JOptionPane.showMessageDialog(null, "Your are so dumb how that is like about the dumest grade");	
		}
		
		if(testsa==30) {
		JOptionPane.showMessageDialog(null, "You are so bad at the game of life and school");
		}
		
		if(testsa==20) {
		JOptionPane.showMessageDialog(null, "Ladies and Gentlemen, I give you... the dumest man in the earth");
		}
		
		if(testsa==10) { 
		JOptionPane.showMessageDialog(null, "Iq=0");
		}
	
		if(testsa==0) { 
		JOptionPane.showMessageDialog(null, "Wow I feel you parents pain");
		}
	}
	}


