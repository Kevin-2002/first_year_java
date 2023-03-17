import java.util.Random;
import javax.swing.JOptionPane;

public class moreMethods8
{
	public static void main(String[] args)
	{
		//declare
		String guess, colour, correctCounter;

		//generate computer random number
		colour = colourgen();

		//get user guess
		guess = userGuess();

		//compare numbers
		checkGuess(colour, guess);

	}

	public static String colourgen()
	{
		//declare var
		int num;
		String colour;

		//declare random class
		Random randomNumber = new Random();

		//generate random number
		num = randomNumber.nextInt(5) + 1;

		if(num == 1)
		{
			colour = "RED";
		}
		else if(num == 2)
		{
			colour = "GREEN";
		}
		else if(num == 3)
		{
			colour = "BLUE";
		}
		else if(num == 4)
		{
			colour = "ORANGE";
		}
		else
		{
			colour = "YELLOW";
		}

		//return value
		return colour;
	}

	public static String userGuess()
	{
		//declare var
		String guess;

		//prompt guess
		guess = JOptionPane.showInputDialog("I'm thinking of a color.\nIs it red,green,blue,orange, or yellow?", "red");

		//return
		return guess;
	}

	public static void checkGuess(String colour, String guess)
	{
		//declare
		int correctCounter = 0;

		//output colour
		JOptionPane.showMessageDialog(null, colour);

		if(colour.equalsIgnoreCase(guess))
		{
			correctCounter++;
		}

		//display correct counter
		JOptionPane.showMessageDialog(null, "Number of correct guesses: " + correctCounter);

	}
}