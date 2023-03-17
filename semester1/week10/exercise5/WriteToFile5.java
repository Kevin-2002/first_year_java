import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile5
{
	public static void main(String[] args) throws IOException
	{
		//declare printwriter - variables
		PrintWriter outputFile = new PrintWriter("File3.txt");
		String fileName, inputStr;

		//Joption prompt filename
		fileName = JOptionPane.showInputDialog("Enter file name: ", "File3.txt");

		inputStr = JOptionPane.showInputDialog("Enter File Content", "This line of text is added to the file!");

		outputFile.print(inputStr);

		//close
		outputFile.close();
	}
}