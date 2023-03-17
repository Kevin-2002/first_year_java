import java.util.Scanner;

public class JavaWhile4
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		int num1;
		int sum = 0;

		//output
		System.out.print("Enter a number : ");
		num1 = keyboard.nextInt();
		sum = sum + num1;

		//while
		while(num1 > 0)
		{
			System.out.print("Enter a number : ");
			num1 = keyboard.nextInt();
			sum = sum + num1;
		}
		System.out.printf("Sum of all numbers entered is: %d%n", sum);
	}
}