import java.util.Scanner;

public class JavaIf8
{
	public static void main(String[] args)
	{

		//Scanner system
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		double num1, num2;

		//Output
		System.out.print("Enter first number: ");
		num1  = keyboard.nextDouble();
		System.out.print("Enter second number: ");
		num2 = keyboard.nextDouble();

		//if-else if-else
		if(num1 > num2)
		{
			System.out.println("the first number, " + num1 + ", is greater than the second number, " + num2);
		}
		else if(num1 < num2)
		{
			System.out.println("The second number, " + num2 + ", is greater than the first number, " + num1);
		}
		else
		{
			System.out.println("The numbers are the same!");
		}

	}
}