import java.util.Scanner;
import java.io.*;

public class Exercise10
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		int count = 1;
		String fileName;

		//declare keyboard scanner
		Scanner keyboard = new Scanner(System.in);

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
			//read in a line
			inputFile.nextLine();

			//increment
			count++;
		}

		System.out.printf("This file has %d lines of text.", count);

		//file close
		inputFile.close();
	}
}