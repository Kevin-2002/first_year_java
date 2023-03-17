public class Array1
{
	public static void main(String[] args)
	{
		//Create an integer array with 4 elements
		int[] myArray = {55, 66, 77, 88};

		//output and access array elements
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);

		//change array[2]
		myArray[2] = 99;
		System.out.println(myArray[2]);
	}
}