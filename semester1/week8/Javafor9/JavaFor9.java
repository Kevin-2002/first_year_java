import java.util.Scanner;

public class JavaFor9
{
	public static void main(String[] args)
	{
		//declaration keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare var
		int start,finish;

		//prompt - output
		System.out.print("Enter a number to start: ");
		start = keyboard.nextInt();
		System.out.print("Enter a number to finish: ");
		finish = keyboard.nextInt();

		//make count from 50 to 65
		for(int i = start; i <= finish; ++i)
		{
			System.out.printf("%d%n", i);
		}
	}
}