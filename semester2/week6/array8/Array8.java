import java.util.Scanner;

public class Array8
{
	public static void main(String[] args)
	{
		//Create an integer array with 4 elements
		String[] names = new String[5];

		//declare scanner
		Scanner keyboard = new Scanner(System.in);

		//read in element values
		System.out.print("Enter name 0: ");
		names[0] = keyboard.nextLine();
		System.out.print("Enter name 1: ");
		names[1] = keyboard.nextLine();
		System.out.print("Enter name 2: ");
		names[2] = keyboard.nextLine();
		System.out.print("Enter name 3: ");
		names[3] = keyboard.nextLine();
		System.out.print("Enter name 4: ");
		names[4] = keyboard.nextLine();

		//text
		System.out.println("\n");
		System.out.println("Names entered are as follows:\n");

		//output to console with for
		for(int i = 0; i  < names.length; i++)
		{
			System.out.println("Index " + i + " is :" + names[i]);
		}
	}
}