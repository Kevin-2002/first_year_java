//import the Random Class
import java.util.*;

public class JavaRandom5
{
	public static void main(String[] args)
	{
		//declare the random class and keyboard
		Random randomNumber = new Random();
		Scanner keyboard = new Scanner(System.in);

		//decalre variable
		int num1, num2, input, ans;

			//output
			System.out.printf("WELCOME TO THE MAHTS ADDITION CAME\n\n");

			//for loop
			for(int i = 1; i <= 5; ++i)
			{

				//Generate a random number and store in num1
				num1 = randomNumber.nextInt(31) + 5;
				num2 = randomNumber.nextInt(31) + 5;

				System.out.printf("What is %d plus %d : ", num1, num2);

				//prompt ans
				input = keyboard.nextInt();

				//calculate
				ans = num1 + num2;

				//if
				if(input == ans)
				{
					System.out.println("Correct!\n");
				}
				else
				{
					System.out.printf("\nHmmmm... that's not correct. The answer is %d%n", ans);

			}//ifclose
		}//forclose
	}
}