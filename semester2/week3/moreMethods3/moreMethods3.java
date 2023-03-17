import java.util.Scanner;

public class moreMethods3
{
	public static void main(String[] args)
	{
		//declare keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		int num1, num2, num3, num4;

		//promt two numbers
		System.out.print("Enter an integer: ");
		num1 = keyboard.nextInt();
		System.out.print("Enter an integer: ");
		num2 = keyboard.nextInt();
		System.out.print("Enter an integer: ");
		num3 = keyboard.nextInt();
		System.out.print("Enter an integer: ");
		num4 = keyboard.nextInt();

		average(num1, num2, num3, num4);
	}

	public static void average(int num1, int num2, int num3, int num4)
	{
		System.out.println("the average of all the numbers is: " + ((num1+num2+num3+num4)/4));
	}
}