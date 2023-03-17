import java.util.Scanner;

public class BasicMethod12
{
	public static void main(String[] args)
	{
		//declare scanner and variables
		Scanner keyboard = new Scanner(System.in);
		double num1, num2, num3;

		//prompt user to enter numbers
		System.out.print("Enter first number: ");
		num1 = keyboard.nextDouble();
		System.out.print("Enter second number: ");
		num2 = keyboard.nextDouble();
		System.out.print("Enter third number: ");
		num3 = keyboard.nextDouble();

		//call average method and pass perameters
		average(num1, num2, num3);
	}

	public static void average(double num1, double num2, double num3)
	{
		//calculate sum
		double sum;
		sum = num1+num2+num3;

		System.out.printf("\nSum of all 3 numers is %.1f%nTHE AVERAGE IS: %f%n----------------------------------------\n", sum, (sum/3));
	}
}