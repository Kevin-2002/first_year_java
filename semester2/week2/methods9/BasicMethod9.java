public class BasicMethod9
{
	public static void main(String[] args)
	{
		calculate(5, 4, "D");
	}

	public static void calculate(double num1, double num2,String operator)
	{
		//declare variables
		double result;

		//if
		if(operator.equalsIgnoreCase("a"))
		{
			result = num1 + num2;
			System.out.printf("Number 1: %.1f%nNumber2: %.1f%nOperator: %S%nResult: %.2f%n", num1, num2, operator, result);
		}
		else if(operator.equalsIgnoreCase("s"))
		{
			result = num1 - num2;
			System.out.printf("Number 1: %.1f%nNumber2: %.1f%nOperator: %S%nResult: %.2f%n", num1, num2, operator, result);
		}
		else if(operator.equalsIgnoreCase("m"))
		{
			result = num1 * num2;
			System.out.printf("Number 1: %.1f%nNumber2: %.1f%nOperator: %S%nResult: %.2f%n", num1, num2, operator, result);
		}
		else if(operator.equalsIgnoreCase("d"))
		{
			result = num1 / num2;
			System.out.printf("Number 1: %.1f%nNumber2: %.1f%nOperator: %S%nResult: %.2f%n", num1, num2, operator, result);
		}
		else
		{
			System.out.println("This is not a valid operator!");
		}
	}
}