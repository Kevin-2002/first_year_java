import java.util.Scanner;

public class UpDown
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, num3;

		//user input/output
		System.out.print("Input number 1: ");
		num1 = keyboard.nextInt();
		System.out.print("Input number 2: ");
		num2 = keyboard.nextInt();
		System.out.print("Input number 3: ");
		num3 = keyboard.nextInt();

		//if/if else//else statements
		if(num3 > num2 && num2 > num1)
		{
			System.out.println("Numbers are incresing in size!");
		}
		else if(num1 > num2 && num2 > num3)
		{
			System.out.println("Numbers are decreasing in size!");
		}
		else
		{
			System.out.println("Numbers are neither increasing or decreasing!");
		}
	}
}