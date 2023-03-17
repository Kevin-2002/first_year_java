import java.util.Scanner;
import java.io.*;

public class Exercise17
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		String readFile, writeFile, contents;
		Scanner keyboard = new Scanner(System.in);

		//prompt user for file name
		System.out.println("Enter file to read from");
		readFile = keyboard.next();
		writeFile = readFile + "- COPY.txt";

		//declare scanner and file objects
		File input = new File(readFile);
		Scanner inputFile = new Scanner(input);
		PrintWriter outputFile = new PrintWriter(writeFile);

		//while loop to read and write file contents
		while(inputFile.hasNext())
		{
			//read into string
			contents = inputFile.nextLine();
			System.out.println(contents);
			outputFile.println(contents);
		}

		//file close
		inputFile.close();
		outputFile.close();
	}
}