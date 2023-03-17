/* Kevin McShane
   Student ID: G00401808
   26/04/2022
   Lab Exam 4 - Software Design and Program Development Year 1
*/
import java.util.Scanner;

public class KevinMcShaneQuestion3
{
	public static void main(String[] args)
	{
		//declare variables
		int start, row, column, ammend;

		//declare keyboard
		Scanner keyboard = new Scanner(System.in);

		//prompt user to enter start number
		System.out.print("Enter first value for 2D array: ");
		start = keyboard.nextInt();

		//declare grid
		int[][] table = new int[3][3];

		//populate array with values
		for(int i = 0; i < table.length; i++)
		{

			for(int x = 0; x < 3; x++)
			{
				table[i][x] = start;
				start++;
			}
		}

		//display array
		System.out.printf("%d\t-\t%d\t-\t%d\t-\n", table[0][0], table[0][1], table[0][2]);
		System.out.printf("%d\t-\t%d\t-\t%d\t-\n", table[1][0], table[1][1], table[1][2]);
		System.out.printf("%d\t-\t%d\t-\t%d\t-\n", table[2][0], table[2][1], table[2][2]);

		//prompt user to ammend
		System.out.println("Ammend a single element!\n");
		System.out.print("Specify row: (Enter 0, 1, 2): ");
		row = keyboard.nextInt();
		System.out.print("Specify column: (Enter 0, 1, 2): ");
		column = keyboard.nextInt();
		System.out.printf("Enter new value for row %d and column %d: ", row, column);
		ammend = keyboard.nextInt();

		//ammend the value
		table[row][column] = ammend;

		//display array
		System.out.printf("%d\t-\t%d\t-\t%d\t-\n", table[0][0], table[0][1], table[0][2]);
		System.out.printf("%d\t-\t%d\t-\t%d\t-\n", table[1][0], table[1][1], table[1][2]);
		System.out.printf("%d\t-\t%d\t-\t%d\t-\n", table[2][0], table[2][1], table[2][2]);
	}//main()
}//class bracket