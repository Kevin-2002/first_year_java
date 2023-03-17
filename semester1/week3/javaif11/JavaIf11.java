import java.util.Scanner;

public class JavaIf11
{
	public static void main(String[] args)
	{

		//Scanner system
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		int day;

		//input
		System.out.print("Enter a day number: ");
		day = keyboard.nextInt();

		//if-else statements
		if(day == 1)
		{
			System.out.println("Monday");
		}
		else if(day == 2)
		{
			System.out.println("Tuesday");
		}
		else if(day == 3)
		{
			System.out.println("Wednesday");
		}
		else if(day == 4)
		{
			System.out.println("Thursday");
		}
		else if(day == 5)
		{
			System.out.println("Friday");
		}
		else if(day == 6)
		{
			System.out.println("Saturday");
		}
		else if(day == 7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("That's not a valid day number!");
		}
	}
}