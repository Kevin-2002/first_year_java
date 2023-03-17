import java.util.Scanner;
import java.io.*;

public class Exercise5
{
	public static void main(String[] args) throws IOException
	{
		//declare keyboard scanner
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		String fileName, output;

		//text
		System.out.print("Enter the filename: ");

		//prompt user which line
		fileName = keyboard.nextLine();

		//specify file to use
		File myFile = new File(fileName);

		//Use scanner to read from the file
		Scanner inputFile = new Scanner(myFile);

		//while
		while(inputFile.hasNext())
		{
			//Store the line from the file into a string variable
			output = inputFile.nextLine();
			System.out.println(output);
		}

		inputFile.close();
	}
}