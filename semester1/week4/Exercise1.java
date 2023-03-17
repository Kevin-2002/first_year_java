import java.util.Scanner;

public class Exercise1
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		int num1;

		//promt input from user
		System.out.print("num1 variable is: ");
		num1 = keyboard.nextInt();

		//check condition using if/else
		if(num1 > 50)
		{
			System.out.println("Value is greater than 50!");
		}
		if(num1 == 50)
		{
			System.out.println("Value is equal to 50!");
		}
		else
		{
			System.out.println("Value is less than 50!");
		}
	}
}