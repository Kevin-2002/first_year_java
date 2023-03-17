import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile12
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		int num, choice;
		String fileName, inputStr;

		//prompt them to name file
		fileName = JOptionPane.showInputDialog("Enter File Name:", "File11.txt");

		//prompt yes no cancel pane
		choice = JOptionPane.showConfirmDialog(null, "Would you like to overwrite existing file content?", "choose an option", JOptionPane.YES_NO_CANCEL_OPTION);

		//if
		if(choice == 0)
		{
			//declare printwriter
			PrintWriter outputFile = new PrintWriter(fileName);

			//prompt input
			inputStr = JOptionPane.showInputDialog("Input", "This should be the only content!");
			outputFile.println(inputStr);

			//close
			outputFile.close();
		}
		else if(choice == 1)
		{
			//declare fwriter - variables
			FileWriter fwriter = new FileWriter(fileName, true);

			//declare printwriter
			PrintWriter outputFile = new PrintWriter(fwriter);

			//prompt input
			inputStr = JOptionPane.showInputDialog("Input", "This text should be appended!");
			outputFile.println(inputStr);

			//close
			outputFile.close();
		}
		else
		{}
	}
}