public class Array6
{
	public static void main(String[] args)
	{
		//Create an integer array with 4 elements
		double[] ex6Array = {32.55, 45.88, 125.21, 456.5, 1.25, 4.1, 89.6, 78.2, 97.2354, 665.01};


		//text
		System.out.println("The array Values are as follows:");

		//output to console with for
		for(int i = 0; i  < ex6Array.length; i++)
		{
			System.out.println("Index " + i + " value is :" + ex6Array[i]);
		}
	}
}