import java.util.Scanner;

public class JavaScanner10
{
	public static void main(String[] args)
	{

		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables-calculations
		String name;
		int year, age;
		int present = 2021;

		//input-output
		System.out.print("Please enter your name: ");
		name = keyboard.nextLine();
		System.out.print("Please enter your year of birth: ");
		year = keyboard.nextInt();
		System.out.println("Greetings, " + name + "! ");

		//calculation
		age = present - year;

		//imput-output
		System.out.println("You were born in " + year + " and therefore you are " + age + " years old.");


	}
}