public class Array3
{
	public static void main(String[] args)
	{
		//Create an integer array with 4 elements
		double[] ex3array = {23.45, 45.44, 76.12};
		double sum;

		//output and access array elements
		System.out.println(ex3array[0]);
		System.out.println(ex3array[1]);
		System.out.println(ex3array[2]);

		//calculate and output total
		sum = ex3array[0] + ex3array[1] + ex3array[2];

		//output result
		System.out.println("The sum of all 3 values is : " + sum);
	}
}