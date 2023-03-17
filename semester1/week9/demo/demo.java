/*this program uses message dialouge boxes to prompt the user for their name, hours
worked and rate of pay*/
import java.util.*;
import javax.swing.JOptionPane;

public class demo
{
	public static void main(String[] args)
	{
		//declare variables
		String inputStr, outputStr, name;
		int hoursWorked, choice;
		double rate, wages;

		//promt and input dialouge
		//syntax JOptionPane.showInputDialog("StringExpression", initial value);
		name = JOptionPane.showInputDialog("Enter name: ", "Kevin");

		inputStr = JOptionPane.showInputDialog("Enter hours worked", "40");

		//convert string to integer
		hoursWorked = Integer.parseInt(inputStr);
		//enter dialog
		inputStr = JOptionPane.showInputDialog("Enter rate: ", "12.50");

		//convert string to double
		rate = Double.parseDouble(inputStr);

		//calculation
		wages = hoursWorked * rate;

		/*
		Output using Message Dialoug box
		Syntax JOptionPane.showMessageDialog(parentComponent/null);

		*/

		outputStr = "Name: " + name + "\nHours worked: " + hoursWorked + "\nRate of Pay: " + String.format("€%.2f", rate) + "\n wages: " + String.format("€%.2f", wages);
		JOptionPane.showMessageDialog(null,outputStr, "Summary", JOptionPane.INFORMATION_MESSAGE);

		/*
		showConfirmDialog - allows user to choose yes/no/cancel
		syntax - JOptionPane.showConfirmDialog(null, message, title, type)
		types - YES_NO_OPTION, YES_NO_CANCEL_OPTION
		YES_OPTION, NO OPTION
		Values - Yes(0), No(1), Cancel(2)
		*/

		choice = JOptionPane.showConfirmDialog(null, "Click yes or no", "choose an option", JOptionPane.YES_NO_OPTION);
		if(choice == 0)
		{
			JOptionPane.showMessageDialog(null, "You choose yes!", "Yes", JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You chose no!", "No", JOptionPane.INFORMATION_MESSAGE);
		}

		//To ensure progran ends correctly
		System.exit(0);

	}
}