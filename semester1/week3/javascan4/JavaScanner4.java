import java.util.Scanner;

public class JavaScanner4
{
	public static void main(String[] args)
	{
		//declare variables
		double num1, num2, sum = 0;
		double average = 0.0;
		//Scanner system
		Scanner keyboard = new Scanner(System.in);
		System.out.print("enter first number : ");
		num1 = keyboard.nextDouble();
		System.out.print("enter second number : ");
		num2 = keyboard.nextDouble();
		//calculations
		sum = num1 + num2;
		average = sum/2;
		//output
		System.out.println("First number entered was : " + num1);
		System.out.println("Second number entered was : " + num2);
		System.out.println("\n\n\nSum of numbers entered is: " + sum);
		System.out.println("Average of numbers entered is: " + average);
	}
}