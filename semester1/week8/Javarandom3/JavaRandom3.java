//import the Random Class
import java.util.Random;

public class JavaRandom3
{
	public static void main(String[] args)
	{
		//declare the random class and keyboard
		Random randomNumber = new Random();

		//decalre variable
		int num1;

		//Generate a random number and store in num1
		num1 = randomNumber.nextInt(20);

		//output
		System.out.printf("Random number: %d%n", num1);
	}
}