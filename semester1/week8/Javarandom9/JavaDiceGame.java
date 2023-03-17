//import the Random Class
import java.util.*;

public class JavaDiceGame
{
	public static void main(String[] args)
	{
		//declare the random class and keyboard
		Random randomNumber = new Random();
		Scanner keyboard = new Scanner(System.in);

		//decalre variable
		int dice1, dice2, guess;

			//output
			System.out.print("LUCKY DICE GAME!\n\nPlace your bets!!\nWhat's your bet?: ");

			//prompt guess
			guess = keyboard.nextInt();

				//Generate a random number and store in num1
				dice1 = randomNumber.nextInt(6);
				dice2 = randomNumber.nextInt(6);

				//output dice
				System.out.printf("Dice 1: %d%n", dice1);
				System.out.printf("Dice 2: %d%n", dice2);

			//if - else
			if(dice1 == guess || dice2 == guess)
			{
				System.out.println("You won!");

			}
			else
			{
				System.out.println("Aw. You lost. Better luck next time.");
			}//if close
	}
}