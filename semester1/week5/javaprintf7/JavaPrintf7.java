import java.util.Scanner;

public class JavaPrintf7
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		double amount, euro, dollar;
		char operator;

		//output
		System.out.println("Enter A to convert dollars to euros\nor B to convert euros to dollars:");
		operator = keyboard.next().charAt(0);

		//if-elseif-else
		if(operator == 'A')
			{
				System.out.println("Enter amount:");
				amount = keyboard.nextDouble();
				//calculation
				euro = amount * 0.86143522;
				System.out.printf("%f dollars is %.2f euros\n", amount, euro);
			}
		else if(operator == 'B')
			{
				System.out.println("Enter amount:");
				amount = keyboard.nextDouble();
				//calculation
				dollar = amount * 1.16746;
				System.out.printf("%f dollars is %.2f euros\n", amount, dollar);
			}
	}
}