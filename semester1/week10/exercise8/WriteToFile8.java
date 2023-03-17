import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile8
{
	public static void main(String[] args) throws IOException
	{
		//declare printwriter - variables
		PrintWriter outputFile = new PrintWriter("java.txt");
		String fileName, inputStr;
		int num;

		inputStr = JOptionPane.showInputDialog("How many lines of text tin this file?", "5");

		//parse
		num = Integer.parseInt(inputStr);

		//prompt what output they give
		inputStr = JOptionPane.showInputDialog("What would you like to output?", "To be or not to be...");

		//for
		for(int i = 1; i <= num; i++)
		{
			outputFile.println(inputStr);
		}

		//close
		outputFile.close();
	}
}