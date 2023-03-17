import java.util.Scanner;

public class Logical_operators3
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);
		int year;

		//user input/output
		System.out.print("Year: ");
		year = keyboard.nextInt();
		System.out.println("Checking if year " + year + " is outside range for 20th century");

		//if/if else//else statements
		if(year <= 1900 || year >= 2000)
		{
			System.out.println("This year was not in the 20th century.");
		}
		else
		{
			System.out.println("This year was in the 20th century.");
		}
	}
}