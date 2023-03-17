import java.util.Scanner;

public class Array9
{
	public static void main(String[] args)
	{
		//Create an integer array with 12 elements
		double[] month = new double[12];

		//declare scanner and var
		Scanner keyboard = new Scanner(System.in);
		double sum, average;
		int count1 = 1;
		int count2 = 1;

		//read in element values
		for(int i = 0; i  < month.length; i++)
		{
			System.out.print("Enter sales for month " + count1 + ": ");
			month[i] = keyboard.nextDouble();
			count1++;
		}

		//text
		System.out.println("\n");
		System.out.println("Names entered are as follows:\n");

		//output to console with for
		for(int i = 0; i  < month.length; i++)
		{
			System.out.println("Month " + count2 + "is: " + month[i]);
			count2++;
		}

		//calculations
		sum = month[0] + month[1] + month[2] + month[3] + month[4] + month[5] + month[6] + month[7] + month[8] + month[9] + month[10] + month[11];
		average = sum/12;

		//text
		System.out.printf("Total sales for the year: %.1f%n", sum);
		System.out.printf("Average monthly sales for the year: %.2f%n", average);
	}
}