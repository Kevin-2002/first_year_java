/* Kevin McShane
   Student ID: G00401808
   26/02/2022
   Lab Exam 3 - Software Design and Program Development Year 1
*/
import java.util.Scanner;
import java.io.*;

public class JoeBidenQuestion1
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		String fileName;

		//prompt filename and declare scanner keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the filename: ");
		fileName = keyboard.nextLine();

		//specify file to use
		File myFile = new File(fileName);

		//declare scanner for the file
		Scanner inputFile = new Scanner(myFile);

		while(inputFile.hasNext())
		{
			System.out.println(inputFile.next());
		}

		//To ensure progran ends correctly
		System.exit(0);


	}//main bracket
}//class bracket