import java.util.Scanner;

public class JavaWhile5
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		int num1;

		//while
		do
		{
			System.out.print("Enter a number : ");
			num1 = keyboard.nextInt();
		} while(num1 > 0 && num1 < 50);
	}
}