import java.util.Scanner;
import java.io.*;

public class Exercise8
{
	public static void main(String[] args) throws IOException
	{
		//specify file to use
		File myFile = new File("Temp.txt");

		//Use scanner to read from the file
		Scanner inputFile = new Scanner(myFile);

		//declare variables
		String day1, day2, day3;
		float temp1, temp2, temp3;

		//Store the line from the file into a string variable
		day1 = inputFile.next();
		temp1 = inputFile.nextFloat();
		day2 = inputFile.next();
		temp2 = inputFile.nextFloat();
		day3 = inputFile.next();
		temp3 = inputFile.nextFloat();

		//output data
		System.out.printf("\n\nDAY 1 : %s - TEMPERATURE: %.1f%n\n", day1, temp1);
		System.out.printf("\n\nDAY 1 : %s - TEMPERATURE: %.1f%n\n", day2, temp2);
		System.out.printf("\n\nDAY 1 : %s - TEMPERATURE: %.1f%n\n\n\n", day3, temp3);

		//file close
		inputFile.close();
	}
}