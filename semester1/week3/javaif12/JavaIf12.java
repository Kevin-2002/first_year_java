import java.util.Scanner;

public class JavaIf12
{
	public static void main(String[] args)
	{

		//Scanner system
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		int month;

		//input
		System.out.print("Enter month number: ");
		month = keyboard.nextInt();

		//if-else statements
		if(month == 1)
		{
			System.out.println("January - 31 days");
		}
		else if(month == 2)
		{
			System.out.println("February - 28 (or 29) days");
		}
		else if(month == 3)
		{
			System.out.println("March - 31 days");
		}
		else if(month == 4)
		{
			System.out.println("April - 30 days");
		}
		else if(month == 5)
		{
			System.out.println("May - 31 days");
		}
		else if(month == 6)
		{
			System.out.println("June - 30 days");
		}
		else if(month == 7)
		{
			System.out.println("July - 31 days");
		}
		else if(month == 8)
		{
			System.out.println("August - 31 days");
		}
		else if(month == 9)
		{
			System.out.println("September - 30 days");
		}
		else if(month == 10)
		{
			System.out.println("October - 31 days");
		}
		else if(month == 11)
		{
			System.out.println("November - 30 days");
		}
		else if(month == 12)
		{
			System.out.println("December - 31 days");
		}
		else
		{
			System.out.println("That's not a valid month number!");
		}
	}
}