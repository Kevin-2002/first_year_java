import java.util.Random;
import javax.swing.JOptionPane;

public class moreMethods7
{
	public static void main(String[] args)
	{
		//declare
		int compNum;//random between 1 and 10
		int guess;

		//generate computer random number
		compNum = computerRandom();

		//get user guess
		guess = userGuess();

		//compare numbers
		checkGuess(guess, compNum);
	}

	public static int computerRandom()
	{
		//declare var
		int compNum;

		//declare random class
		Random randomNumber = new Random();

		//generate random number
		compNum = randomNumber.nextInt(10) + 1;

		//return value
		return compNum;
	}

	public static int userGuess()
	{
		//declare var
		String str;
		int guess;

		//prompt guess
		str = JOptionPane.showInputDialog("Guess a number between 1 and 10", "5");

		//parse
		guess = Integer.parseInt(str);

		//return
		return guess;
	}

	public static void checkGuess(int guess, int compNum)
	{
		if(guess == compNum)
		{
			JOptionPane.showMessageDialog(null, "You guessed correctly!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, better luck next time.");
		}
	}
}