//import the Random Class
import java.util.Random;

public class JavaRandom4
{
	public static void main(String[] args)
	{
		//declare the random class and keyboard
		Random randomNumber = new Random();

		//decalre variable
		int num1, num2;

		//Generate a random number and store in num1
		num1 = randomNumber.nextInt(30);
		num2 = randomNumber.nextInt(30);

		//output
		System.out.printf("Random number 1: %d%nRandom number 2: %d%n", num1, num2);
	}
}