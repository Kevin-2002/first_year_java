import java.util.Scanner;

public class JavaWhile2
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		int test;
		String word;

		//output
		System.out.print("What word(s) will be output: ");
		word = keyboard.nextLine();
		System.out.print("Enter number of times word should be printed: ");
		test = keyboard.nextInt();

		//while
		while(test > 0)
		{
			System.out.println(word);
			test--;
		}
	}
}