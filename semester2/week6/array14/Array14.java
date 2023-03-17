import java.util.Scanner;

public class Array14
{
	public static void main(String[] args)
	{
		//declare keyboard and variables
		Scanner keyboard = new Scanner(System.in);
		int arrayLength;

		//prompt user for array length
		System.out.print("What size is the array: ");
		arrayLength = keyboard.nextInt();

		//declare the array
		int[] numbers = new int[arrayLength];
		int average;
		int biggest = 0;
		int smallest = 0;
		int history = 0;

		//for
		for(int i = 0; i < arrayLength; i++)
		{
			System.out.printf("Enter array value for index %d: ", i);
			numbers[i] = keyboard.nextInt();
		}

		//text
		System.out.println("Array entry complete. The array is as follows:");

		//for
		for(int i = 0; i < arrayLength; i++)
		{
			System.out.println(numbers[i]);
		}

		//check for the biggest number
		for(int i = 0; i < arrayLength; i++)
		{
			if(biggest < numbers[i])
			{
				biggest = numbers[i];
			}//if
		}//for

		//check for the smallest number
		for(int i = 0; i < arrayLength; i++)
		{
			while(smallest == 0 || smallest > numbers[i])
			{
				smallest = numbers[i];
			}
		}//for

		//calculate total array sum
		for(int i = 0; i < arrayLength; i++)
		{
			history = history + numbers[i];
		}//for

		//calculate average
		average = history/arrayLength;

		//text
		System.out.println("The biggest number is: " + biggest);
		System.out.println("The smallest number is: " + smallest);
		System.out.println("The average input is : " + average);
	}//main
}