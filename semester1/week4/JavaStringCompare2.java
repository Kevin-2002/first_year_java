import java.util.Scanner;

public class JavaStringCompare2
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);
		String name, password;

		//user input/output
		System.out.println("Enter username: ");
		name = keyboard.nextLine();
		System.out.println("Enter password: ");
		password = keyboard.nextLine();

		//if/if else//else statements
		if(name.equals("Bob") && password.equals("pass"))
		{
			System.out.println("___________________________________________________________________\n");
			System.out.println("         S Y S T E M   A C C E S S   G R A N T E D"            );
			System.out.println("___________________________________________________________________");
		}
		else
		{
			System.out.println("ACCESS DENIED.");
		}
	}
}