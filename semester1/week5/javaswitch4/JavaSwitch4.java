import java.util.Scanner;

public class JavaSwitch4
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variable
		char letter;

		//output
		System.out.print("Enter letter: ");
		letter = keyboard.next().charAt(0);

		//switch
		switch(letter)
		{
			case 'a':
			case 'A':
				System.out.println("Apple");
				break;
			case 'b':
			case 'B':
				System.out.println("Banana");
				break;
			case 'c':
			case 'C':
				System.out.println("Coconut");
				break;
			default:
				System.out.println("Invalidvalue entered.");
				break;
		}
	}
}