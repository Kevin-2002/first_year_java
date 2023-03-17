//import the Random Class
import java.util.Random;

public class JavaRandom7
{
	public static void main(String[] args)
	{
		//declare the random class and keyboard
		Random randomNumber = new Random();

			//decalre variable
			double num1;

			//generate random double
			num1 = randomNumber.nextDouble() + 0;

			//output
			System.out.println(num1);
	}
}