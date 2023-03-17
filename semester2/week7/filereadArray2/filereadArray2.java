import java.util.Scanner;
import java.io.*;

public class filereadArray2
{
	public static void main(String[] args) throws IOException
	{
		//use the file called numbers.txt
		String filename = "myFile.txt";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		//create an array of ints called nums
		String[] namesList = new String[26];

		//populate each index of the array with data from the file
		for(int i = 0; i < namesList.length; i++)
		{
			namesList[i] = inputFile.nextLine();
		}

		//for
		for(int i = 0; i < namesList.length; i++)
		{
			System.out.println(namesList[i]);
		}

		//close file to update changes
		inputFile.close();
	}
}