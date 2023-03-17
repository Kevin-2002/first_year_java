/* Kevin McShane
   Student ID: G00401808
   01/03/2022
   Lab Exam 3 - Software Design and Program Development Year 1
*/
import java.util.Scanner;
import java.io.*;

public class KevinMcShaneQuestion1
{
	public static void main(String[] args) throws IOException
	{
		//specify file to use
		File myFile = new File("Tuesday.txt");

		//declare scanner for the file
		Scanner inputFile = new Scanner(myFile);

		//for
		for(int i = 1; i <= 3; i++)
		{
			System.out.println(inputFile.nextLine());
		}

		//To ensure progran ends correctly
		System.exit(0);
	}//main()
}//class bracket