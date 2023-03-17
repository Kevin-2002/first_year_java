import java.io.*;
import java.util.Random;

public class WriteToFile17
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		int randNum;
		String fileName;

		//declare intsance of random class
		Random randomNumber = new Random();

		//generate random number
		randNum = randomNumber.nextInt(10000) + 999;

		//generate file name
		fileName = "A" + randNum + ".txt";

		//declare printwriter
		PrintWriter output = new PrintWriter(fileName);

		//output message
		output.printf("This is a file with a randomly generated file name\nThe name of this file is %s", fileName);

		//to update outputFile
		output.close();
	}
}