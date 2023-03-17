public class BasicMethod7
{
	public static void main(String[] args)
	{
		addNumbers(5, 4);
	}

	public static void addNumbers(double num1, double num2)
	{
		System.out.printf("number 1 is %.1f%n Number 2 is %.1f%n Addition is: %.1f%n", num1, num2, (num1 + num2));
	}
}