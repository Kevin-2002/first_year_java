import java.util.Scanner;

public class Exercise5
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		double num1;
		System.out.print("Enter first number: ");
		num1 = keyboard.nextDouble();
		double num2;
		System.out.print("Enter second number: ");
		num2 = keyboard.nextDouble();

		//if/else statements
		if(num1 > num2)
		{
			System.out.println("The first number is greater than the second number");
		}
		else if(num1 == num2)
		{
			System.out.println("The first number is equal to the second number");
		}
		else
		{
			System.out.println("The second number is greater than first the number");
		}
	}
}