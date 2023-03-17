import java.util.Scanner;
import java.io.*;

public class Exercise7
{
	public static void main(String[] args) throws IOException
	{
		//declare keyboard scanner
		Scanner keyboard = new Scanner(System.in);

		//specify file to use
		File myFile = new File("Add_Double.txt");

		//declare variables
		double total = 0;
		double num;

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
			num = Double.parseDouble(myVariable);

			total = total + num;
		}

		//add all numbers and output message
		System.out.printf("TOTal OF ALL NUMBERS IN FILE IS: %f%n", total);

		inputFile.close();
	}
}