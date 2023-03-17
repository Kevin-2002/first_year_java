public class moreMethods1
{
	public static void main(String[] args)
	{
		higher(5, 4);
	}

	public static void higher(int num1, int num2)
	{
		//if
		if(num1 > num2)
		{
			System.out.printf("%d is greater than %d%n", num1, num2);
		}
		else
		{
			System.out.printf("%d is not greater than %d%n", num1, num2);
		}
	}
}