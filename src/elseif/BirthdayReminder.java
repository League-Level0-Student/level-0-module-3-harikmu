
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birthday = JOptionPane.showInputDialog("Which birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
		if (birthday == "mom") {
			System.out.println("November 20, 1972");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		if (birthday == "dad") {
			System.out.println("May 31, 1968");
		}
			// print dad's birthday
		// 6. if user asked for your name
		if (birthday == "hari") {
			System.out.println("June 19, 2005");
		}
			
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry, I don't remember that person's birthday!");
		}
	} 
}
