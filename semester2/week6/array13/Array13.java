import java.util.Scanner;

public class Array13
{
	public static void main(String[] args)
	{
		//declare keyboard and variables
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {2, 4, 6, 23, 67, 75, 45, 67, 78, 65, 45, 45, 43, 98, 9, 8, 9, 12};
		int biggest = numbers[0];
		int smallest = numbers[0];

		//check for the biggest number
		for(int i = 0; i < numbers.length; i++)
		{
			if(biggest < numbers[i])
			{
				biggest = numbers[i];
			}
		}

		//check for the smallest number
		for(int i = 0; i < numbers.length; i++)
		{
			if(smallest > numbers[i])
			{
				smallest = numbers[i];
			}
		}

		//text
		System.out.println("The biggest number is: " + biggest);
		System.out.println("The smallest number is: " + smallest);

	}//main
}