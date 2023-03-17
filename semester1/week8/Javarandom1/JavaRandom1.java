//import the Random Class
import java.util.Random;

public class JavaRandom1
{
	public static void main(String[] args)
	{
		//declare the random class
		Random randomNumber = new Random();

		//decalre variable
		int num1;

		//Generate a random number and store in num1
		num1 = randomNumber.nextInt(10);

		//output num1 variable
		System.out.println(num1);
	}
}