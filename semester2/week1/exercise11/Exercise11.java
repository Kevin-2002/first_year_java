import java.util.Scanner;
import java.io.*;

public class Exercise11
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		int count = 1;
		String fileName, line;

		//declare keyboard scanner
		Scanner keyboard = new Scanner(System.in);

		//text
		System.out.print("Enter the filename: ");

		//prompt user which line
		fileName = keyboard.nextLine();

		//specify file to use
		File myFile = new File(fileName);

		//if
		if(myFile.exists())
		{
			//Use scanner to read from the file
			Scanner inputFile = new Scanner(myFile);

			//read file
			line = inputFile.nextLine();

			//text
			System.out.printf("File exists, outputting first line from file.\n %s%n", line);

			//file close
			inputFile.close();
		}
		else
		{
			//text
			System.out.println("No such file, exiting program.");
		}
	}
}