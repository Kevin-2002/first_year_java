import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile13
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		int count, finish, screen, file;
		String input, output, fileName;

		//prompt them to name file
		fileName = JOptionPane.showInputDialog("Enter File Name:", "File13.txt");

		//declare printwritter
		PrintWriter outputFile = new PrintWriter(fileName);

		//promt user to enter start of count - parse
		input = JOptionPane.showInputDialog("Start count at:", "500");
		count = Integer.parseInt(input);

		//promt user to enter finish of count - parse
		input = JOptionPane.showInputDialog("Finish count at:", "9000");
		finish = Integer.parseInt(input);

		//ask user if they would like to outpyt to screen
		screen = JOptionPane.showConfirmDialog(null, "Output to Screen", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);

		//if
		if(screen == 0)
		{
			//for
			for(int i = count; count <= finish ;count++)
			{
				//display message
				System.out.printf("Count: %d%n", count);
			}//for
		}//if

		//ask user if they would like to outpyt to screen
		file = JOptionPane.showConfirmDialog(null, "Output to File", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);

		//if
		if(file == 0)
		{
			//for
			for(int i = count; count <= finish ;count++)
			{
				//display message
				outputFile.printf("count: %d%n", count);
			}//for
		}//if

		//to update changes
		outputFile.close();
	}
}