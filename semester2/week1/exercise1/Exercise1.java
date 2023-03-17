import java.util.Scanner;
import java.io.*;


public class Exercise1
{
	public static void main(String[] args) throws IOException
	{
		//specify file to use
		File myFile = new File("Quotes.txt");

		//Use scanner to read from the file
		Scanner inputFile = new Scanner(myFile);

		//Store the line from the file into a string variable
		String myVariable = inputFile.nextLine();

		System.out.println(myVariable);

		inputFile.close();
	}
}