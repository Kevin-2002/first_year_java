import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile6
{
	public static void main(String[] args) throws IOException
	{
		//declare printwriter - variables
		PrintWriter outputFile = new PrintWriter("java.txt");
		String fileName;

		//for
		for(int i = 1; i <= 10; i++)
		{
			outputFile.println("This is java!");
		}

		//close
		outputFile.close();
	}
}