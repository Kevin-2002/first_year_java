import java.util.Scanner;

public class JavaIf7
{
	public static void main(String[] args)
	{

		//Scanner system
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		double num1, num2, action, add, sub, div, mult, modulo;

		//Output
		System.out.print("Enter first number: ");
		num1  = keyboard.nextDouble();
		System.out.print("Enter second number: ");
		num2 = keyboard.nextDouble();
		System.out.print("Would you like to add or subtract? (Enter 1 for Add or 2 for Subtract)?: ");
		action = keyboard.nextDouble();

		//calculations
		add = num1 + num2;
		sub = num1 - num2;
		div = num1 / num2;
		mult = num1 * num2;
		modulo = num1 % num2;

		//if-else if-else
		if(action == 1)
		{
			System.out.println("answer is: " + add);
		}
		else if(action == 2)
		{
			System.out.println("answer is: " + sub);
		}
		else if(action == 3)
		{
			System.out.println("answer is: " + div);
		}
		else if(action == 4)
		{
			System.out.println("answer is: " + mult);
		}
		else
		{
			System.out.println("answer is: " + modulo);
		}

	}
}