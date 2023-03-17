/* Kevin McShane
   Student ID: G00401808
   04/11/2021
   Lab Exam 2 - Software Design and Program Development Year 1
*/

import java.io.*;
import javax.swing.JOptionPane;

public class KevinMcShaneLabExam2Q4
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		String input, fileName, content;
		int choice, lines;

		//prompt user ot enter a file name
		fileName = JOptionPane.showInputDialog("Enter a file name:", "File1.txt");

		//promt user to choose either to append or not to append
		choice = JOptionPane.showConfirmDialog(null, "Do you want overwrite file?\n\n (Click YES to overwrite, NO to append)", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);

		//switch - (for yes no or cancel)
		switch(choice)
		{
			case 0:

				//declare printwriter
				PrintWriter outputFile1 = new PrintWriter(fileName);

				//ask user how many lines they want to add
				input = JOptionPane.showInputDialog("How many lines of text would you like to add?", "2");
				lines = Integer.parseInt(input);

				//for
				for(int i = 1; i <= lines; i++)
				{
					//prompt user for content
					content = JOptionPane.showInputDialog("Enter content:", "");

					//print to file
					outputFile1.print(content + "\n");

				}//for

				//close file(update changes)
				outputFile1.close();

				break;
			case 1:

				//declare fwriter
				FileWriter fwriter = new FileWriter(fileName, true);

				//declare printwriter
				PrintWriter outputFile2 = new PrintWriter(fwriter);

				//ask user how many lines they want to add
				input = JOptionPane.showInputDialog("How many lines of text would you like to add?", "2");
				lines = Integer.parseInt(input);

				//for
				for(int i = 1; i <= lines; i++)
				{
					//prompt user for content
					content = JOptionPane.showInputDialog("Enter content:", "");

					//print to file
					outputFile2.print(content + "\n");

				}//for

				//close file(update changes)
				outputFile2.close();

				break;
		}//switch

		//output a message to say program complete
		JOptionPane.showMessageDialog(null, "Program complete", "Message", JOptionPane.INFORMATION_MESSAGE);

		//to ensure program ends correctly (for JOptionPane)
		System.exit(0);

	}//main bracket
}//class bracket