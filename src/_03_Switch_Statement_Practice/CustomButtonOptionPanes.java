package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
			case "Sunday":{
				JOptionPane.showMessageDialog(null, "It's snooze-in day!");
				break;
			}
			case "Monday":{
				JOptionPane.showMessageDialog(null, "Hot chocolate before work!");
				break;
			}
			case "Tuesday":{
				JOptionPane.showMessageDialog(null, "Cat cuddles after dinner!");
				break;
			}
			case "Wednesday":{
				JOptionPane.showMessageDialog(null, "Week's half-way over!");
				break;
			}
			case "Thursday":{
				JOptionPane.showMessageDialog(null, "No bad hair day for today!");
				break;
			}
			case "Friday":{
				JOptionPane.showMessageDialog(null, "Free dress pajama day!");
				break;
			}
			case "Saturday":{
				JOptionPane.showMessageDialog(null, "Responsibilities out, Netflix in.");
				break;
			}
		}
	}
}
