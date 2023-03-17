import java.util.Scanner;

public class JavaIf9
{
	public static void main(String[] args)
	{

		//Scanner system
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		double num1;

		//Output
		System.out.print("Enter number: ");
		num1  = keyboard.nextDouble();

		//if-else if-else
		if(num1 % 2 == 0)
		{
			System.out.println("The number entered is even");
		}
		else
		{
			System.out.println("The number entered is odd");
		}

	}
}