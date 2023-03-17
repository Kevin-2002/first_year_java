import java.util.Scanner;

public class BasicMethod16
{
	public static void main(String[] args)
	{
		//declare scan and var
		Scanner keyboard = new Scanner(System.in);
		double num1, num2, result;
		char operator;

		//prompt user to enter detail
		System.out.print("Enter number 1: ");
		num1 = keyboard.nextDouble();
		System.out.print("Enter number 2: ");
		num2 = keyboard.nextDouble();
		System.out.print("Enter operator: ");
		operator = keyboard.next().charAt(0);

		result = calculate(num1, num2, operator);
		System.out.println("The answer is: " + result);
	}//main

	public static double calculate(double num1, double num2, char operator)
	{
		//declare
		double result = 0;

		//if
		if(operator == 'a' || operator == 'A')
		{
			result = num1 + num2;
		}
		else if(operator == 's' || operator == 'S')
		{
			result = num1 - num2;
		}
		else if(operator == 'm' || operator == 'M')
		{
			result = num1 * num2;
		}
		else if(operator == 'd' || operator == 'D')
		{
			result = num1 / num2;
		}
		else
		{
			System.out.println("This is not a valid operator!");
		}//else
		return result;
	}//calculate
}