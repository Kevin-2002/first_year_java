import java.util.Scanner;

public class JavaDoWhile1
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		int num1;
		char letter;

		//while
		do
		{
			System.out.print("Enter a number : ");
			num1 = keyboard.nextInt();

			if(num1 % 2 == 0)
			{
				System.out.println("Number is even");
			}
			else
			{
				System.out.println("Number is odd");
			}
			System.out.print("Enter Y to continue: ");
			letter = keyboard.next().charAt(0);
		} while(letter == 'Y' || letter == 'y');
	}
}