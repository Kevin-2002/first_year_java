import java.util.Scanner;
import java.util.Random;

public class BasicMethod17
{
	public static void main(String[] args)
	{
		//declare
		String result;
		int num1, num2, num3;

		//coinflip
		result = coinflip();
		System.out.printf("Flip of coin: %s%n", result);

		//rollDice
		num1 = rollDice();
		System.out.printf("Roll the Dice/die: %d%n", num1);

		//roll2Dice
		num3 = roll2Dice();
		System.out.printf("Roll the Dice/die: %d%n", num3);
	}//main

	public static String coinflip()
	{
		//declare random
		Random randomNumber = new Random();
		String result = "";

		//generate random number (0-1)
		int num1;
		num1 = randomNumber.nextInt(2) + 1;

		//if
		if(num1 == 1)
		{
			result = "Heads";
		}
		else if(num1 == 2)
		{
			result = "Tails";
		}

		//return statement
		return result;
	}//method

	public static int rollDice()
	{
		//declare random
		Random randomNumber = new Random();

		//generate random number (0-5)
		int num1;
		num1 = randomNumber.nextInt(6) + 1;

		//return statement
		return num1;
	}//method

	public static int roll2Dice()
	{
		//declare variables
		int num1, num2, num3;

		//generate numbers
		num1 = rollDice();
		num2 = rollDice();

		//add both numbers to get number from 1 to 12
		num3 = num1 + num2;

		//return statement
		return num3;
	}//method
}