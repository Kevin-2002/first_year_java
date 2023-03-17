import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile11
{
	public static void main(String[] args) throws IOException
	{
		//declare printwriter - variables
		FileWriter fwriter = new FileWriter("File11.txt", true);

		//declaer printwriter
		PrintWriter outputFile = new PrintWriter(fwriter);

		//declare variables
		int num;
		String fileName, inputStr;

		//prompt them to name file
		JOptionPane.showInputDialog("Enter File Name:", "File11.txt");

		//prompt user to give amount of lines
		inputStr = JOptionPane.showInputDialog("How many lines of text would you like to add?", "3");
		num = Integer.parseInt(inputStr);

		//for
		for(int i = 1; i <= num; i++)
		{
			inputStr = JOptionPane.showInputDialog("Enter File content for line " + i, "");
			outputFile.println(inputStr);
		}
		//close
		outputFile.close();
	}
}