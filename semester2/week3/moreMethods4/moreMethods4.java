import java.util.Scanner;

public class moreMethods4
{
	public static void main(String[] args)
	{
		//declare keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		double speed;
		int time;

		//promt number
		System.out.print("Enter the vehicle's speed: ");
		speed = keyboard.nextInt();

		//validate speed is greater than 0
		while(speed < 0)
		{
			System.out.print("Enter the vehicle's speed: ");
			speed = keyboard.nextInt();
		}

		//promt number
		System.out.print("Enter the number of hours the vehicle was in motion: ");
		time = keyboard.nextInt();

		do
		{
			System.out.print("Enter the number of hours the vehicle was in motion: ");
			time = keyboard.nextInt();
		}while(time < 0);

		System.out.println("Hour\t\tDistance Traveled");
		System.out.println("----------------------------------");

		calculator(speed, time);
	}

	public static void calculator(double speed, int time)
	{
		for(int i = 1; i <= time; i++)
		{
			System.out.printf("%d\t\t%.1f%n", i, (speed*i));
		}//for
	}
}