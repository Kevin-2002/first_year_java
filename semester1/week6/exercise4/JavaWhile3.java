import java.util.Scanner;

public class JavaWhile3
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		char letter;
		int variable = 0;

		//output
		System.out.printf("Value of number variable is %d%n", variable);
		System.out.print("Enter Y to continue: ");
		letter = keyboard.next().charAt(0);

		//while
		while(letter == 'Y' || letter == 'y')
		{
		System.out.printf("Value of number variable is %d%n", variable);
		System.out.print("Enter Y to continue: ");
		letter = keyboard.next().charAt(0);
		++variable;
		}
	}
}