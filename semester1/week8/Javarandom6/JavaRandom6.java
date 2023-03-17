//import the Random Class
import java.util.Random;

public class JavaRandom6
{
	public static void main(String[] args)
	{
		//declare the random class and keyboard
		Random randomNumber = new Random(1);

			//decalre variable
			double num1;

			//generate random double
			num1 = randomNumber.nextDouble();

			//output
			System.out.println(num1);
	}
}