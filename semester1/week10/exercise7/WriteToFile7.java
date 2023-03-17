import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile7
{
	public static void main(String[] args) throws IOException
	{
		//declare printwriter - variables
		PrintWriter outputFile = new PrintWriter("java.txt");
		String fileName, inputStr;
		int num;

		inputStr = JOptionPane.showInputDialog("How many lines of text tin this file?", "4");

		//parse
		num = Integer.parseInt(inputStr);


		//for
		for(int i = 1; i <= num; i++)
		{
			outputFile.println("This is java!");
		}

		//close
		outputFile.close();
	}
}