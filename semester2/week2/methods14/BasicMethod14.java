import java.util.Scanner;

public class BasicMethod14
{
	public static void main(String[] args)
	{
		//declare var
		double num1;
		int num2;
		String name;

		num1 = timesTen(15);
		System.out.println(num1);

		num2 = square(10);
		System.out.println(num2);

		System.out.print("Enter name: ");
		name = getName();

	}

	public static Double timesTen(double num1)
	{
		//multiply by ten
		double result;
		result = num1*10;
		return result;
	}

	public static int square(int num1)
	{
		//multiply by ten
		int result;
		result = num1^2;
		return result;
	}

	public static String getName()
	{
		//declare scanner class
		Scanner keyboard = new Scanner(System.in);
		String name;

		//prompt user to enter name
		name = keyboard.nextLine();

		return name;
	}
}