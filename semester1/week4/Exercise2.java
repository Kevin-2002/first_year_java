import java.util.Scanner;

public class Exercise2
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		double temp;
		System.out.print("Temperature is :");
		temp = keyboard.nextDouble();

		//if/else statements
		if(temp > 25)
		{
			System.out.println("It's hot outside!");
		}
		else if(temp >= 5)
		{
			System.out.println("It's okay outside!");
		}
		else
		{
			System.out.println("It's cold outside!");
		}
	}
}