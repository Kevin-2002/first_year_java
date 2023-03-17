public class BasicMethod6
{
	public static void main(String[] args)
	{
		printTable(56);
	}

	public static void printTable(int num)
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.printf("%d times %d is equals to %d%n", num, i, (num*i));
		}
	}
}