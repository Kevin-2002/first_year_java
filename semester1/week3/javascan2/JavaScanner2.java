import java.util.Scanner;

public class JavaScanner2
{
	public static void main(String[] args)
	{
		//Declare variables
		int number1;
		int number2;
		int number3;
		//Import system
		Scanner keyboard = new Scanner(System.in);
		System.out.print("enter first number : ");
		number1 = keyboard.nextInt();
		System.out.print("Please enter a second number : ");
		number2 = keyboard.nextInt();
		System.out.print("Please enter a third number : ");
		number3 = keyboard.nextInt();
		System.out.println("First number entered was : " + number1);
		System.out.println("Second number entered was : " + number2);
		System.out.println("Third number entered was : " + number3);
	}
}