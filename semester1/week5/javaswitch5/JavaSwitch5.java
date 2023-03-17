import java.util.Scanner;

public class JavaSwitch5
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variable
		int choice;

		//output
		System.out.print("Select number: ");
		choice = keyboard.nextInt();

		//switch
		switch(choice)
		{
			case 1:
				System.out.println("You selected 1.");
				break;
			case 2:
				System.out.println("You selected 2 or 3.");
				break;
			case 3:
				System.out.println("You selected 2 or 3.");
				break;
			case 4:
				System.out.println("You selected 4.");
				break;
			default:
				System.out.println("Select again please.");
				break;
		}
	}
}