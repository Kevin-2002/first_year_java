import java.util.Scanner;

public class JavaIf4
{
	public static void main(String[] args)
	{
		//Scanner system
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		int n1 = 50;

		if(n1 > 0)
			{
				System.out.println("Value of n1 is 50. That's positive!");
			}
		if(n1 < 0)
			{
				System.out.println("Value of n1 is -20. That's negative!");
			}
		if(n1 == 0)
			{
				System.out.println("Value of n1 is 0. That's positive!");
			}
	}
}