import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;

public class Exercise12
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		int count = 1;
		String fileName, line;

		//prompt user which line
		fileName = JOptionPane.showInputDialog("Enter the filename:", "random.txt");

		//specify file to use
		File myFile = new File(fileName);

		//Use scanner to read from the file
		Scanner inputFile = new Scanner(myFile);

		while(inputFile.hasNext())
		{
			//read
			inputFile.next();

			//count
			count++;
		}

		//message
		JOptionPane.showMessageDialog(null, "This file has " + count + " words.");

		//file close
		inputFile.close();
	}
}