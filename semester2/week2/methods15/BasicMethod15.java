import java.util.Scanner;

public class BasicMethod15
{
	public static void main(String[] args)
	{
		//declare var and scanner
		Scanner keyboard = new Scanner(System.in);
		double result, amount;
		String operator;

		//prompt them to enter amount
		System.out.print("Enter Currency Amount: ");
		amount = keyboard.nextDouble();
		System.out.print("Is this Dollars or Euros? (Enter 'D' for dollars or 'E' for euros): ");
		operator = keyboard.next();

		//if
		if(operator.equalsIgnoreCase("e"))
		{
			//call eurotodol
			result = eurosToDollars(amount);
			System.out.printf("dol %.2f%n\n", result);
		}
		else if(operator.equalsIgnoreCase("d"))
		{
			//call eurotodol
			result = dollarsToEuros(amount);
			System.out.printf("eur %.2f%n\n", result);
		}
	}

	public static Double dollarsToEuros(double num1)
	{
		//convert
		double result;
		result = num1*0.88;
		return result;
	}

	public static Double eurosToDollars(double num1)
	{
		//convert
		double result;
		result = num1*1.12;
		return result;
	}
}