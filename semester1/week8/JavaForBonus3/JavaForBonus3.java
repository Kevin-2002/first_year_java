import java.util.*;

public class JavaForBonus3
{
	public static void main(String[] args)
	{
		//declare instance of scanner and random event
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();

		//decalre variables
		int dice, guess;

		//generate a dice number
		dice = randomNumber.nextInt(100) + 1;

		//for
		for(int i = 1; i <= 6; i++)
		{
				//output and promt guess
				System.out.print("Guess a number between 1 and 100: ");
				guess = keyboard.nextInt();

				//if - else
				if(guess < dice)
				{
					System.out.println("Too low");
				}
				else if(guess > dice)
				{
					System.out.println("Too high");
				}
				else
				{
					System.out.println("\nCongratulations! You win!");
				}//ifclose
			}//for close

		//bad ending
		System.out.printf("Sorry, you didn't win. the answer was %d%n", dice);

	}
}