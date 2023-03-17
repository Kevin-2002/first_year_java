import java.util.Scanner;

public class Exercise4
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		int userNumber;
		System.out.print("Enter a number: ");
		userNumber = keyboard.nextInt();

		//if/else statements
		if(userNumber >= 0)
		{
			System.out.println("The number you entered is positive");
		}
		else
		{
			System.out.println("The number you entered is negative");
		}
	}
}