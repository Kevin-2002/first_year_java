import java.util.Scanner;

public class JavaFor5
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);
		int i, count;

		//display message
		System.out.print("Counter Program\nThis program will count from zero up to whatever number you enter.\n\nEnter a number to count up to: ");

		//prompt input from the user
		count = keyboard.nextInt();

		//for loop
		for(i = 0; i <= count; ++i)
		{
			System.out.println(i);
		}
	}
}