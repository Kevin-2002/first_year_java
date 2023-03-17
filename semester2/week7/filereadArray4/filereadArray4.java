import java.util.Scanner;
import java.io.*;

public class filereadArray4
{
	public static void main(String[] args) throws IOException
	{
		//use the file called numbers.txt
		String filename = "rainfall.txt";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		//create an array of ints called nums
		double[] rain = new double[365];

		//declar var
		double total = 0;
		double highest = rain[0];
		double lowest = rain[0];
		int highDay = 0, lowDay = 0;

		//populate each index of the array with data from the file
		for(int i = 0; i < rain.length; i++)
		{
			rain[i] = inputFile.nextDouble();

			//calculate total
			total = total + rain[i];
		}

		//for
		for(int i = 0; i < rain.length; i++)
		{
			System.out.printf("Rainfall for day %d was %.2f%n", (i + 1), rain[i]);

			if(rain[i] >= highest)
			{
				highest = rain[i];
				highDay = i;
			}

			if(rain[i] <= lowest)
			{
				lowest = rain[i];
				lowDay = i;
			}
		}

		System.out.printf("Total rainfall for the year was: %.2f%n", total);
		System.out.printf("Average daily rainfall was: %.2f%n", total/365);
		System.out.printf("Average weekly rainfall was: %.2f%n", total/52);
		System.out.printf("Average monthly rainfall was: %.2f%n", total/12);
		System.out.printf("The day with highest rainfall was day %d, which had %.2fmm of rainfall that day.\n", (highDay+1), highest);
		System.out.printf("The day with lowest rainfall was day %d, which had %.2fmm of rainfall that day.\n", (lowDay+1), lowest);

		//close file to update changes
		inputFile.close();
	}
}