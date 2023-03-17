import java.util.Scanner;

public class Exercise6
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		int firstNum, secondNum, result;
		char operator;
		System.out.print("Enter first number: ");
		firstNum = keyboard.nextInt();
		System.out.print("Enter second number: ");
		secondNum = keyboard.nextInt();
		System.out.print("Enter operator: (a, s, d, m,): ");
		operator = keyboard.next().charAt(0);

		//if/elseif/else
		if(operator == 'a')
		{
			result = firstNum + secondNum;
			System.out.println(firstNum + " plus " + secondNum + " is : " + result);
		}
		else if(operator == 's')
		{
			result = firstNum - secondNum;
			System.out.println(firstNum + " minus " + secondNum + " is : " + result);
		}
		else if(operator == 'd')
		{
			result = firstNum / secondNum;
			System.out.println(firstNum + " divided by " + secondNum + " is : " + result);
		}
		else if(operator == 'm')
		{
			result = firstNum * secondNum;
			System.out.println(firstNum + " multiplied by " + secondNum + " is : " + result);
		}
		else
		{
			System.out.println("invalid operator");
		}
	}
}