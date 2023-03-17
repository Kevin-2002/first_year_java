import java.util.Scanner;

public class Logical_operators1
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);


		//user input/output
		int temp;
		System.out.print("Enter temperature: ");
		temp = keyboard.nextInt();
		System.out.println("Current temperature is: " + temp);

		//if/if else//else statements
		if(temp > -10 && temp < 30)
		{
			System.out.println("Current temperature is within the normal range.");
		}
		else
		{
			System.out.println("Current temperature is outside the normal range.");
		}
	}
}