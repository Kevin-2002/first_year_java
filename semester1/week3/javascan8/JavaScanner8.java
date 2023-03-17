import java.util.Scanner;

public class JavaScanner8
{
	public static void main(String[] args)
	{

		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables-calculations
		String name;

		//input-output
		System.out.print("Please enter your name: ");
		name = keyboard.nextLine();
		System.out.println("Greetings, " + name + "! ");

	}
}