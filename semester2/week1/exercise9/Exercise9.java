import java.util.Scanner;
import java.io.*;

public class Exercise9
{
	public static void main(String[] args) throws IOException
	{
		//declare keyboard scanner
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		String firstname, surname, fileName;
		double pay, increase, raise;

		//text
		System.out.print("Enter the filename: ");

		//prompt user which line
		fileName = keyboard.nextLine();

		//text
		System.out.println("FILE OPENED IS: " + fileName + "\n");

		//specify file to use
		File myFile = new File(fileName);

		//Use scanner to read from the file
		Scanner inputFile = new Scanner(myFile);

		//while
		while(inputFile.hasNext())
		{
			//Store the line from the file into a string variable
			//surname
			surname = inputFile.next();
			//firstname
			firstname = inputFile.next();
			//pay
			pay = inputFile.nextFloat();
			//increase
			increase = inputFile.nextFloat();

			//calculate raise
			raise = pay * increase;


			System.out.printf("EMPLOYEE DETAILS\n %s %s - RAISE WILL BE: %.2f%n\n-------------------\n\n", firstname, surname, raise);
		}

		//file close
		inputFile.close();
	}
}