//import the Random Class
import java.util.*;

public class JavaRandom2
{
	public static void main(String[] args)
	{
		//declare the random class and keyboard
		Random randomNumber = new Random();
		Scanner keyboard = new Scanner(System.in);

		//decalre variable
		int num1, num2;

		//Generate a random number and store in num1
		num1 = randomNumber.nextInt(10) + 1;

		//output
		System.out.print("GUESSING GAME\nGuess the random number generated between 1 and 10: ");
		num2 = keyboard.nextInt();

		//if statement
		if(num1 == num2)
		{
			System.out.println("You guessed correctly!");
		}
		else
		{
			System.out.printf("It was %d. Better luck next time!\n", num1);
		}
	}
}