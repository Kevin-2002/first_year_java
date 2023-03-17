import java.util.*;
import javax.swing.JOptionPane;

public class SampleExam2Q3
{
	public static void main(String[] args)
	{
	//declare variables
	int age, num1, count, choice;
	int total = 0;
	int year = 2021;
	String inputStr, outputStr, name;
	String history = "";

	//JOptionPane - intro message
	JOptionPane.showMessageDialog(null, "Welcome to the Java Adder Program", "Message", JOptionPane.INFORMATION_MESSAGE);

	//promt - enter name
	name = JOptionPane.showInputDialog("Enter your name:", "Bob");

	//prompt - enter age
	inputStr = JOptionPane.showInputDialog("Enter your age:", "20");

	//convert age to int
	age = Integer.parseInt(inputStr);

	//calculate age
	year = year - age;

	//message - display name and year of birth
	JOptionPane.showMessageDialog(null, "Hi Bob\n\nYou were born in " + year, "Message", JOptionPane.INFORMATION_MESSAGE);

	//Enter the first number
	inputStr = JOptionPane.showInputDialog("Enter first number:", "11");
	//Convert input to integer
	num1 = Integer.parseInt(inputStr);

		//do .. while (choice==0)
		do
		{
			//Set up history string with initial details
			history = history + num1 + "\n";

			//Add first number to running total & history string
			total = total + num1;

			//Prompt user if they want to enter another number to add to total via confirm dial
			choice = JOptionPane.showConfirmDialog(null ,"Do you want to add another number to this" ,"Select an Option" ,JOptionPane.YES_NO_CANCEL_OPTION);

			//If the user clicked yes, then they will be prompted to enter another number
			if(choice == 0)
			{
				//Enter the first number
				inputStr = JOptionPane.showInputDialog("Enter another number:", "11");

				//Convert input to integer
				num1 = Integer.parseInt(inputStr);
			}
		}while (choice == 0);

		//Closing message
		JOptionPane.showMessageDialog(null, "Calcuclations complete.\nThe numbers entered were: \n" + history + "--------\nTOTAL:" + total, "Message", JOptionPane.INFORMATION_MESSAGE);

	}
}