import java.util.Scanner;

public class JavaScanner9
{
	public static void main(String[] args)
	{

		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables-calculations
		String name;
		int age;

		//input-output
		System.out.print("Please enter your name: ");
		name = keyboard.nextLine();
		System.out.print("Please enter your age: ");
		age = keyboard.nextInt();
		System.out.println("Greetings, " + name + "! ");
		System.out.println("You are " + age + " years old.");

	}
}