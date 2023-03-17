import java.util.Scanner;

public class Logical_operators2
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);


		//user input/output
		int amount1, amount2;
		System.out.print("Amount 1: ");
		amount1 = keyboard.nextInt();
		System.out.print("Amount 2: ");
		amount2 = keyboard.nextInt();

		//if/if else//else statements
		if(amount1 > 10 && amount2 < 100)
		{
			System.out.println("Amount 1 is greater than 10\nAmount2 is less than 100!");
		}
		else
		{
			System.out.println("The numbers are not in the specified range!");
		}
	}
}