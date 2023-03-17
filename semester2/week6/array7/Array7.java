import java.util.Scanner;

public class Array7
{
	public static void main(String[] args)
	{
		//Create an integer array with 4 elements
		int[] ex7Array = new int[5];

		//declare scanner
		Scanner keyboard = new Scanner(System.in);

		//read in element values
		System.out.print("Enter value 0: ");
		ex7Array[0] = keyboard.nextInt();
		System.out.print("Enter value 1: ");
		ex7Array[1] = keyboard.nextInt();
		System.out.print("Enter value 2: ");
		ex7Array[2] = keyboard.nextInt();
		System.out.print("Enter value 3: ");
		ex7Array[3] = keyboard.nextInt();
		System.out.print("Enter value 4: ");
		ex7Array[4] = keyboard.nextInt();

		//text
		System.out.println("\n");
		System.out.println("Values entered are as follows:\n");

		//output to console with for
		for(int i = 0; i  < ex7Array.length; i++)
		{
			System.out.println("Index " + i + " value is :" + ex7Array[i]);
		}
	}
}