import java.util.Scanner;

public class JavaPrintf6
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		double miles, km;
		int decimal;

		//output
		System.out.println("Enter miles: ");
		miles = keyboard.nextDouble();
		System.out.println("Enter how many decimal points are required in answer (0, 1, 2 or 3");
		decimal = keyboard.nextInt();

		//calculations
		km = miles * 1.609;

		//switch statements
		switch(decimal)
		{
			case 0:
				System.out.printf("%f miles is %.0f kilometers\n", miles, km);
				break;
			case 1:
				System.out.printf("%f miles is %.1f kilometers\n", miles, km);
				break;
			case 2:
				System.out.printf("%f miles is %.2f kilometers\n", miles, km);
				break;
			case 3:
				System.out.printf("%f miles is %.3f kilometers\n", miles, km);
				break;
			default:
				System.out.printf("%f miles is %f kilometers\n", miles, km);
				break;
		}
	}
}