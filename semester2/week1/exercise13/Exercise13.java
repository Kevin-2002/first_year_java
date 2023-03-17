import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class Exercise13
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		int count = 1;
		int lineNum;
		String fileName, line;

		//declare randomiser
		Random randomNumber = new Random();

		//generate random number
		lineNum = randomNumber.nextInt(1899);

		//specify file to use
		File myFile = new File("random.txt");

		//Use scanner to read from the file
		Scanner inputFile = new Scanner(myFile);

		//while
		while(inputFile.hasNext())
		{
			//read
			line = inputFile.nextLine();

			//if
			if(lineNum == count)
			{
				//message
				JOptionPane.showMessageDialog(null, "Random Quote of the Day\n\n" + line);
			}
			//increment
			count++;
		}

		//file close
		inputFile.close();
	}
}