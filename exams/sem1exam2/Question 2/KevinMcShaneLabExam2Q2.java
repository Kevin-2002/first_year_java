/* Kevin McShane
   Student ID: G00401808
   04/11/2021
   Lab Exam 2 - Software Design and Program Development Year 1
*/

import javax.swing.JOptionPane;

public class KevinMcShaneLabExam2Q2
{
	public static void main(String[] args)
	{
		//declare constants
		final double converter = 0.88;

		//declare variables
		String input;
		double dollars, choice, euros;

		//output message
		JOptionPane.showMessageDialog(null , "Welcome to the Java Converion Program.", "Message", JOptionPane.INFORMATION_MESSAGE);

		//do - while
		do
		{
			//promt user to enter amount of dollars to convert
			input = JOptionPane.showInputDialog("Enter dollar amount to be converted:", "100.00");
			dollars = Double.parseDouble(input);

			//calculate convertion
			euros = dollars * converter;

			//output calculation and ask them if they wish to make another one
			choice = JOptionPane.showConfirmDialog(null, dollars + "dollars is " + euros + "euros.", "Choose an Option", JOptionPane.YES_NO_OPTION);
		}while(choice == 0);

		//to ensure program ends correctly (for JOptionPane)
		System.exit(0);

	}//main bracket
}//class bracket