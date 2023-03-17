import java.util.Scanner;

public class Exercise7
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		double grade;
		System.out.println("Enter a grade : ");
		grade = keyboard.nextDouble();

		//if/if else/else
		if(grade > 100)
		{
			System.out.println("An incorrect score was entered");
		}
	}
}