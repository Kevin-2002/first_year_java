/* Kevin McShane
   Student ID: G00401808
   date: 05-04-2022
   sample lab 4
*/

import java.util.Scanner;
import java.io.*;

public class KevinMcShaneQuestion3
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		int totalAvg, q1Avg;
		int totalHistory = 0;
		int q1History = 0;

		//use the file called numbers.txt
		String filename = "temp.txt";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		//declare arrays
		int[] total = new int[365];

		//total
		//read in from file into array
		for(int i = 0; i < total.length; i++)
		{
			total[i] = inputFile.nextInt();
			totalHistory = totalHistory + total[i];

			if(i <= 91)
			{
				q1History = q1History + total[i];
			}
		}

		//calculate avg
		totalAvg = totalHistory/total.length;

		//output
		System.out.printf("Average daily temperature was: %d celcius\n", totalAvg);
	}//main bracket
}//class bracket