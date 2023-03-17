import java.util.Scanner;

public class ThreeNumbers
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, num3;

		//user input/output
		System.out.print("Input the 1st number: ");
		num1 = keyboard.nextInt();
		System.out.print("Input the 2nd number: ");
		num2 = keyboard.nextInt();
		System.out.print("Input the 3rd number: ");
		num3 = keyboard.nextInt();

		//if/if else//else statements
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("Biggest number is : " + num1);
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println("Biggest number is : " + num2);
		}
		else
		{
			System.out.println("Biggest number is : " + num3);
		}
	}
}