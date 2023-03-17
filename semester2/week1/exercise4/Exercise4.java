import java.util.Scanner;
import java.io.*;

public class Exercise4
{
	public static void main(String[] args) throws IOException
	{
		//declare keyboard scanner
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		String fileName;

		//text
		System.out.print("Enter the filename: ");

		//prompt user which line
		fileName = keyboard.nextLine();

		//specify file to use
		File myFile = new File(fileName);

		//Use scanner to read from the file
		Scanner inputFile = new Scanner(myFile);

		//Store the line from the file into a string variable
		String myVariable = inputFile.nextLine();

		//print line
		System.out.println(myVariable);

		inputFile.close();
	}
}