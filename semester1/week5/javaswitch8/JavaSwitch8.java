import java.util.Scanner;

public class JavaSwitch8
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variable
		int num1, num2, sum, diff, div, mult;
		char operator;

		//output
		System.out.print("Enter first number: ");
		num1 = keyboard.nextInt();
		System.out.print("Enter second number: ");
		num2 = keyboard.nextInt();
		System.out.print("Enter operator: (a, s, d, m): ");
		operator = keyboard.next().charAt(0);

		//switch
		switch(operator)
		{
			case 'a':
			case 'A':
				sum = num1 + num2;
				System.out.println(num1 + " plus " +  num2 + " is " + sum);
				break;
			case 's':
			case 'S':
				diff = num1 - num2;
				System.out.println(num1 + " minus " +  num2 + " is " + diff);
				break;
			case 'd':
			case 'D':
				div = num1 / num2;
				System.out.println(num1 + " divide " +  num2 + " is " + div);
			case 'm':
			case 'M':
				mult = num1 * num2;
				System.out.println(num1 + " multiply " +  num2 + " is " + mult);
			default:
				System.out.println("That's not a valid option!");
				break;
		}
	}
}