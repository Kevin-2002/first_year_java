public class Array4
{
	public static void main(String[] args)
	{
		//Create an integer array with 4 elements
		int[] myArray = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		int sum, firstFive, lastFive;

		//calculare totals
		sum = myArray[0] + myArray[1] + myArray[2] + myArray[3] + myArray[4] + myArray[5] + myArray[6] + myArray[7] + myArray[8] + myArray[9];
		firstFive = myArray[0] + myArray[1] + myArray[2] + myArray[3] + myArray[4];
		lastFive = myArray[5] + myArray[6] + myArray[7] + myArray[8] + myArray[9];

		//output result
		System.out.println("The sum of all 10 values is : " + sum);
		System.out.println("The sum of the first 5 values is : " + firstFive);
		System.out.println("The sum of the last 5 values is : " + lastFive);

	}
}