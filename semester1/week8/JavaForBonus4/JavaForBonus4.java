import java.util.*;

public class JavaForBonus4
{
	public static void main(String[] args)
	{
		//declare instance of scanner and random event
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();

		//decalre variables
		int num1, num2, guess, ans;
		int corrects = 0;

			//output and promt answer
			System.out.println("Type in the answer of the equations.");

			//for
			for(int i = 1; i <= 10; i++)
			{
				//generate a dice number
				num1 = randomNumber.nextInt(31) + 5;
				num2 = randomNumber.nextInt(31) + 5;
				ans = num1 + num2;

				//output equation
				System.out.printf("%d + %d = ", num1, num2);

				//input ans
				guess = keyboard.nextInt();

				//if else
				if(guess == ans)
				{
					++corrects;
				}
				else
				{
					System.out.print("");
				}

			}//for close

		//ending
		System.out.printf("Well done! You got %d correct!\n", corrects);

	}
}