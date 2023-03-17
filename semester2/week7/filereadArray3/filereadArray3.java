import java.util.Scanner;
import java.io.*;

public class filereadArray3
{
	public static void main(String[] args) throws IOException
	{
		//declar var
		double total = 0;

		//use the file called numbers.txt
		String filename = "weekly.txt";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		//create an array of ints called nums
		double[] coffee = new double[7];

		//populate each index of the array with data from the file
		for(int i = 0; i < coffee.length; i++)
		{
			coffee[i] = inputFile.nextDouble();

			//calculate total
			total = total + coffee[i];
		}

		//for
		for(int i = 0; i < coffee.length; i++)
		{
			System.out.println("Take for day " + (i+1) + " was " + coffee[i]);
		}

		System.out.println("Total take for the week was: " + total);

		//close file to update changes
		inputFile.close();
	}
}