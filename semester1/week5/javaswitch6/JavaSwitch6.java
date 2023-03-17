import java.util.Scanner;

public class JavaSwitch6
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variable
		String name;

		//output
		System.out.print("Enter a username: ");
		name = keyboard.nextLine();

		//switch
		switch(name)
		{
			case "Grace":
				System.out.println("Welcome Grace - Admin level access granted!");
				break;
			case "Larry":
				System.out.println("Welcome Larry - User level access granted!");
				break;
			default:
				System.out.println("Access is denied!");
				break;
		}
	}
}