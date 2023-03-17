import java.util.Scanner;

public class JavaStringCompare1
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);
		String name1, name2;

		//user input/output
		System.out.print("Enter first name: ");
		name1 = keyboard.nextLine();
		System.out.print("Enter second name: ");
		name2 = keyboard.nextLine();

		//if/if else//else statements
		if(name1.equals(name2))
		//if(name1.equalsIgnoreCase(name2))
		{
			System.out.println("The names " + name1 + " and " + name2 + " match!");
		}
		else
		{
			System.out.println(name1 + " and " + name2 + " are different!");
		}
	}
}