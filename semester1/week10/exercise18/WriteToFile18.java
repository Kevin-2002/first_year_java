import java.io.*;
import java.util.Random;

public class WriteToFile18
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		int randNum, randLetter;
		String fileName;
		char n = ' ';

		//declare intsance of random class
		Random randomNumber = new Random();

		//generate random number
		randNum = randomNumber.nextInt(500 + 1) + 5500;

		//generate random letter
		randLetter = randomNumber.nextInt(2 + 1) + 1;

		//switch - to generate random letter
		switch(randLetter)
		{
			case 1:
				n = 'R';
				break;
			case 2:
				n = 'S';
				break;
			case 3:
				n = 'T';
		}

		//generate file name
		fileName = n + "-" + randNum + ".txt";

		//declare printwriter
		PrintWriter output = new PrintWriter(fileName);

		//output message
		output.printf("This is a file with a randomly generated file name\nThe name of this file is %s", fileName);

		//to update outputFile
		output.close();
	}
}