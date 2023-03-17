import java.util.Scanner;

public class moreMethods2
{
	public static void main(String[] args)
	{
		//declare keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		int num1, num2;

		//promt two numbers
		System.out.print("Enter an integer: ");
		num1 = keyboard.nextInt();
		System.out.print("Enter an integer: ");
		num2 = keyboard.nextInt();

		higher(num1, num2);
	}

	public static void higher(int num1, int num2)
	{
		//if
		if(num1 > num2)
		{
			System.out.printf("%d is greater than %d%n", num1, num2);
		}
		else
		{
			System.out.printf("%d is not greater than %d%n", num1, num2);
		}
	}
}