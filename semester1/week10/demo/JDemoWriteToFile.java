//import the Random Class
import java.util.*;
import java.io.*;

public class JDemoWriteToFile
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//declare variables
		String filename;
		Scanner keyboard = new Scanner(System.in);
		String firstname, lastname; //Store fist and last name
		int i, IDNumber; //storeloop control varand ID

		//prompt input file name
		System.out.print("Please enter file name: ");
		filename = keyboard.nextLine();

		//create new file object for writing and opens the file
		//If this file doesn't exist it is created and opened for writing
		PrintWriter outputFile = new PrintWriter(filename);

		System.out.println("creting the output file\n");

		//prompt-input 4 student details
		for(i = 0; i<4; i++)
		{
			System.out.print("Enter ID: ");
			IDNumber = keyboard.nextInt();
			System.out.print("Enter first name: ");
			firstname = keyboard.nextLine();
			System.out.print("Enter last name: ");
			lastname = keyboard.nextLine();

			//may be some processing here

			//output info to screen - outputs to screen
			System.out.printf("%-10d%n%-10s%n%-10s%n", IDNumber, firstname);

			//output info to file
			outputFile.printf("%-10d%n%-10s%n%-10s%n", IDNumber, firstname);
		}//end of loop
		System.out.println("File created");

		//close file
		outputFile.close();
	}
}