import java.util.Scanner;

public class Array10
{
	public static void main(String[] args)
	{
		//declare keyboard and variables
		Scanner keyboard = new Scanner(System.in);
		int arrayNumber, ammend;
		int index = -1;

		//prompt user to enter how many values are in the array
		System.out.print("How many names do you wish to enter?: ");
		arrayNumber = keyboard.nextInt();
		keyboard.nextLine();

		//declare an array
		String[] names = new String[arrayNumber];

		//prompt user for names
		for(int i = 0; i < names.length; i++)
		{
			System.out.printf("Enter names for index %d: ", i);
			names[i] = keyboard.nextLine();
		}

		//Output details of array
		System.out.println("\n\nNAMES ENTERED\n");

		for(int i = 0; i < names.length; i++)
		{
			System.out.printf("Name index %d %s%n", i, names[i]);
		}

		//prompt user to ammend names?
		System.out.println("Amend name entered? (Enter index to change or enter minus 1 to end):");
		index = keyboard.nextInt();
		keyboard.nextLine();

		while(index != -1)
		{
				//text
				System.out.printf("Current name at index %d is: %s%n", index, names[index]);

				//prompt
				System.out.print("Enter new value: ");
				names[index] = keyboard.nextLine();

				//prompt user to ammend names?
				System.out.println("Amend name entered? (Enter index to change or enter minus 1 to end):");
				index = keyboard.nextInt();
				keyboard.nextLine();
		}//while1

		//Output details of array
		System.out.println("\n\nNAMES ENTERED\n");

		for(int i = 0; i < names.length; i++)
		{
			System.out.printf("Name index %d %s%n", i, names[i]);
		}
	}//main
}