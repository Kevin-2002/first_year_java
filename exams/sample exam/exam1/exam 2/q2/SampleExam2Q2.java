import java.util.*;

public class SampleExam2Q2
{
	public static void main(String[] args)
	{
		//declare
		Scanner keyboard = new Scanner (System.in);
		int start, end, range, rand;

		// Output message to screen
		System.out.print("Question 2\nThis program will generate a random number based on input from the user\nEnter number that random number starts at: ");

		//Prompt/Input number that random number starts at
		start = keyboard.nextInt();

		//Prompt/Input number that random number ends at
		System.out.print("Enter number that random number ends at: ");
		end = keyboard.nextInt();

		//Output message indicating what the program will do
		System.out.printf("The program will now generate 10 random numbers between %d and %d%n", start, end);

		// Create instance of random number class
		Random randomNumber = new Random();

		//for loop to create 10 random numbers in the range and output them
		for(int i = 1; i <= 10; i++)
		{
			rand =  randomNumber.nextInt(end) + start-1;

			//output random number
			System.out.println(rand);
		}
	}
}