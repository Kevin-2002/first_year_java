import java.util.Scanner;

public class JavaDoWhile2
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		String pass;

		//do while
		do
		{
			System.out.print("Enter password: ");
			pass = keyboard.nextLine();
		}while(!pass.equals("mypass"));
		System.out.println("Access granted");
	}
}