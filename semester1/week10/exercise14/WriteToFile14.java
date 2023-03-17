import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile14
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		String input, output, fileName;

		//prompt them to name file
		fileName = JOptionPane.showInputDialog("Enter File Name:", "Datafile.txt");

		//declare printwritter
		PrintWriter outputFile = new PrintWriter("Data/" + fileName);

		//file made commment
		JOptionPane.showMessageDialog(null, "File Write Complete!", "Message", JOptionPane.INFORMATION_MESSAGE);

		//prompt them to name file
		fileName = JOptionPane.showInputDialog("Enter File Name:", "Another File");

		//declare printwritter
		PrintWriter AnotherFile = new PrintWriter("Data/" + fileName + ".txt");

		//to update changes
		outputFile.close();

		//To ensure progran ends correctly
		System.exit(0);
	}
}