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
		int dice, guess;

			//output
			System.out.print("LUCKY DICE GAME!\n\nPlace your bets!!\n what side will the land on?: ");

			//prompt guess
			guess = keyboard.nextInt();

				//Generate a random number and store in num1
				dice = randomNumber.nextInt(6);

			//if - else
			if(dice == guess)
			{
				System.out.println("You won!");

			}
			else
			{
				System.out.println("Aw. You lost. Better luck next time.");
			}//if close
	}
}