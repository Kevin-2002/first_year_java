import java.util.Scanner;

public class JavaScanner1
{
	public static void main(String[] args)
	{
		int num;

		Scanner keyboard = new Scanner(System.in);
		num = keyboard.nextInt();

		System.out.println("Number input was: " +num);
	}
}