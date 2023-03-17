import java.util.Scanner;

public class JavaIf6
{
	public static void main(String[] args)
	{

		//Scanner system
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		double num;

		//Output
		System.out.print("Enter number: ");
		num  = keyboard.nextInt();

		//if-else if-else
		if(num >= 100)
		{
			System.out.println("Number you entered is 100 or greater!");
		}
		else
		{
			System.out.println("Number you entered is less than 100");
		}

	}
}