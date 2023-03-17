import java.util.Scanner;
import java.io.*;

public class filereadArray1
{
	public static void main(String[] args) throws IOException
	{
		//use the file called numbers.txt
		String filename = "numbers.txt";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		//create an array of ints called nums
		int[] nums = new int[5];

		//populate each index of the array with data from the file
		nums[0] = inputFile.nextInt();
		nums[1] = inputFile.nextInt();
		nums[2] = inputFile.nextInt();
		nums[3] = inputFile.nextInt();
		nums[4] = inputFile.nextInt();

		//for
		for(int i = 0; i <= 4; i++)
		{
			System.out.println(nums[i]);
		}

		//close file to update changes
		inputFile.close();
	}
}