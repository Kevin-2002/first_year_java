import java.util.Scanner;

public class JavaFor6
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variable
		int i,number,result;

		//message
		System.out.print("Multiplication Table\n\n\nEnter a number to generate multiplication tables for: ");

		//prompt
		number = keyboard.nextInt();

		//for loop
		for(i = 1; i <= 10; i++)
		{
			result = number * i;
			System.out.printf("%d times %d is %d%n", number, i, result);
		}
	}
}