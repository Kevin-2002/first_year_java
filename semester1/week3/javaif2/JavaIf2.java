import java.util.Scanner;

public class JavaIf2
{
	public static void main(String[] args)
	{
		//Scanner system
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		double number1 = 0;

		if(number1 >0)
			{
				System.out.println("Number is greater than zero.");
			}
		if(number1 <0)
			{
				System.out.println("Number is less than zero.");
			}

		if(number1 == 0)
			{
				System.out.println("Number is equal to zero.");
			}

		System.out.println("End of program");
	}
}