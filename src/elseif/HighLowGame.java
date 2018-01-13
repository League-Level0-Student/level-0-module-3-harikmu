//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(99) + 1;
		boolean win = false;
	
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
		
		for (int i = 0; i < 5; i++) {
			
			String guess = JOptionPane.showInputDialog("Guess the number I'm thinking of");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int number = Integer.parseInt(guess);
			// 5. if the guess is correct
			if (number == random) {
				// 6. win
				win = true;
				break;
			}
			// 7. if the guess is high
			if (number > random) {
				// 8. tell them it's too high
				JOptionPane.showMessageDialog(null, "Too high");

			}
			// 9. if the guess is low
			if (number < random) {
				// 10. tell them it's too low
				JOptionPane.showMessageDialog(null, "Too low");
				
			}
			
		} 
		if (win == true) {
			JOptionPane.showMessageDialog(null, "Win");
		}
		if (win == false) {
			JOptionPane.showMessageDialog(null, "You lost");
		}
	
			
		// 12. tell them they lose 
			
	}

}


