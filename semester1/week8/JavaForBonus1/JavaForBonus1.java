public class JavaForBonus1
{
	public static void main(String[] args)
	{
		//outer for loop 5 times
		for(int i = 1; i <= 5; ++i)
		{
			//inner for loop 10 times
			for(int x = 1; x <= 10; ++x)
			{
				System.out.print("*");
			}//forclose(10times)

			//print new line
			System.out.print("\n");

		}//forclose(5times)
	}
}