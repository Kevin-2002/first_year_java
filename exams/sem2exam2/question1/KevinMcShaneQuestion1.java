/* Kevin McShane
   Student ID: G00401808
   26/04/2022
   Lab Exam 4 - Software Design and Program Development Year 1
*/
import java.util.Scanner;
import java.io.*;

public class KevinMcShaneQuestion1
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		String filename;

		//declare keyboard
		Scanner keyboard = new Scanner(System.in);

		//prompt user to enter filename
		System.out.print("Enter filename: ");
		filename = keyboard.nextLine();

		//declare fileScanner and file
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		//create an array
		String[] words = new String[1000];

		//populate each index of the array with data from the file
		for(int i = 0; i < words.length; i++)
		{
			words[i] = inputFile.nextLine();
		}

		//message to user that we are displaying the last 10 lines of the file
		System.out.println("Outputting last 10 lines of the array");

		//output the last 10 values
		for(int i = 990; i < words.length; i++)
		{
			System.out.println(words[i]);
		}

		//close file to update changes
		inputFile.close();
	}//main()
}//class bracket