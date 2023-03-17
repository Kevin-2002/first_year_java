import java.util.Scanner;

public class JavaPrintf5
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		double wage = 20076.345;
		String name;
		double increase, wage2, wage3;

		//output
		System.out.print("Enter Employee Name: ");
		name = keyboard.nextLine();
		System.out.printf("Current wage is currently EUR %,.2f%n", wage);
		System.out.print("Enter percentage increase: ");
		increase = keyboard.nextDouble();
		System.out.printf("Percentage wage increase is: %.3f%n", increase);

		///////////////////////////////////////////////////////////////////

		wage2 = wage * (increase / 100);
		System.out.printf("Wage increase in value is: EUR %,.2f%n", wage2);
		wage3 = wage + wage2;
		System.out.printf("%S's new wage is: %,.2f%n", name ,wage3);

	}
}