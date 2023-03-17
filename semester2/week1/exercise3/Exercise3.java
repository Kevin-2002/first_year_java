import java.util.Scanner;
import java.io.*;

public class Exercise3
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		int line;

		//specify file to use
		File myFile = new File("Quotes.txt");

		//Use scanner to read from the file
		Scanner inputFile = new Scanner(myFile);

		//declare keyboard scanner
		Scanner keyboard = new Scanner(System.in);

		//text
		System.out.println("Output which line?:");

		//prompt user which line
		line = keyboard.nextInt();

		//for
		for(int i = 1; i <=12; i++)
		{
			//Store the line from the file into a string variable
			String myVariable = inputFile.nextLine();

			//if
			if(i == line)
			System.out.println(myVariable);
		}

		inputFile.close();
	}
}