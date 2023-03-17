import java.util.Scanner;

public class JavaScanner7
{
	public static void main(String[] args)
	{

		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables-calculations
		double num1, num2, sum, sub, div, mult;

		//input-output
		System.out.print("Enter first number: ");
		num1 = keyboard.nextDouble();
		System.out.print("Enter second number: ");
		num2 = keyboard.nextDouble();

		//calculations
		sum = num1 + num2;
		sub = num1 - num2;
		div = num1 / num2;
		mult = num1 * num2;

		//input-output
		System.out.println("___________________________________");
		System.out.println("Number 1 + number2 is: " + sum);
		System.out.println("Number 1 - number2 is: " + sub);
		System.out.println("Number 1 / number2 is: " + div);
		System.out.println("Number 1 * number2 is: " + mult);
		System.out.println("___________________________________");

	}
}