/* Kevin McShane
   Student ID: G00401808
   date: 05-04-2022
   sample lab 4
*/

import java.util.Scanner;

public class KevinMcShaneQuestion1
{
	public static void main(String[] args)
	{
		//declare keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		int arraylength;

		//prompt user for array length
		System.out.print("Define array size: ");
		arraylength = keyboard.nextInt();

		//declare array
		int[] numbers = new int[arraylength];

		//prompt array values
		for(int i = 0; i < arraylength; i++)
		{
			System.out.printf("Enter array value for index %d: ", i);
			numbers[i] = keyboard.nextInt();
		}

		//display array
		System.out.println("\n\n");
		System.out.println("Array has been created. The array is as follows:");
		for(int i = 0; i < arraylength; i++)
		{
			System.out.println(numbers[i]);
		}

	}//main bracket
}//class bracket