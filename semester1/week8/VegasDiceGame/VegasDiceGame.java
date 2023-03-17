import java.util.*;

public class VegasDiceGame
{
	public static void main(String[] agrs)
	{
		//declare random generator and keyboard instance
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();

		//declare variables
		int bet, dice1, dice2, dice;
		int counter = 1;
		int bal = 100;

		//opening message
		System.out.println("Vegas to the Craps game!\n\nYou have $100 dollars in your wallet.\n");

		do
		{
			//generate random numbers
			dice1 = randomNumber.nextInt(6);
			dice2 = randomNumber.nextInt(6);

			//initial game message
			System.out.print("-- Place your bet --\nHow much are you betting?: ");

			//promt a bet
			bet = keyboard.nextInt();

			//display dice roll
			System.out.printf("Dice 1: %d%n", dice1);
			System.out.printf("Dice 2: %d%n", dice2);

			//determin win or loss
			dice = dice1 + dice2;

			//if win loss
			if(dice == 7 || dice == 11)
			{
				System.out.println("You won!");
				//add bet to bal
				bal = bal + bet;
			}
			else if(dice == 2 || dice == 3 || dice == 12)
			{
				System.out.println("You lost.");
				bal = bal - bet;
			}
			else
			{
				System.out.println("No winner!");
			}

			//display wallet
			System.out.printf("You have %d in your wallet.\n\n", bal);

			//increase counter
			counter++;

		}while(bal > 0 && counter <= 10);

		//end statement
		System.out.println("Program has ended!");
	}
}