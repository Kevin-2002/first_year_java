import java.util.Scanner;
import java.io.*;

public class Exercise6
{
	public static void main(String[] args) throws IOException
	{
		//declare keyboard scanner
		Scanner keyboard = new Scanner(System.in);

		//specify file to use
		File myFile = new File("Add_int.txt");

		//declare variables
		int total = 0;
		int num;

		//Use scanner to read from the file
		Scanner inputFile = new Scanner(myFile);

		//while
		while(inputFile.hasNext())
		{
			//Store the line from the file into a string variable
			String myVariable = inputFile.nextLine();

			//Store the line from the file into a string variable
			System.out.println(myVariable);

			//parse myVariable
			num = Integer.parseInt(myVariable);

			total = total + num;
		}

		//add all numbers and output message
		System.out.printf("TOTal OF ALL NUMBERS IN FILE IS: %s%n", total);

		inputFile.close();
	}
}