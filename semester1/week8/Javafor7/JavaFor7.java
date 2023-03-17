import java.util.Scanner;

public class JavaFor7
{
	public static void main(String[] args)
	{
		//declaration keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variable
		int i,number;

		//message
		System.out.print("\n\nEnter a number: ");

		//prompt
		number = keyboard.nextInt();

		for(i = 0; i <= 100; i = i + number)
		{
			System.out.printf("%d%n", i);
		}
	}
}