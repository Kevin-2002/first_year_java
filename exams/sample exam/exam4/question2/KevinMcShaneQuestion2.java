/* Kevin McShane
   Student ID: G00401808
   date: 05-04-2022
   sample lab 4
*/
public class KevinMcShaneQuestion2
{
	public static void main(String[] args)
	{
		//declare variables
		int yGridAxis = 0;
		int counter = 2000;

		//declare array
		int[][] myCounter = new int[2][5];

		//populate array with values
		for(int i = 0; i < myCounter.length; i++)
		{
			yGridAxis = i;
			for(int x = 0; x < 5; x++)
			{
				myCounter[yGridAxis][x] = counter;
				counter++;
			}
		}

		//display array
		System.out.println("                 --------------------------------------");
		System.out.printf("                  %d    %d    %d    %d    %d%n\n", myCounter[0][0], myCounter[0][1], myCounter[0][2], myCounter[0][3], myCounter[0][4]);
		System.out.printf("                  %d    %d    %d    %d    %d%n\n", myCounter[1][0], myCounter[1][1], myCounter[1][2], myCounter[1][3], myCounter[1][4]);
		System.out.println("                 --------------------------------------");
		System.out.println("\n\n");
	}//main bracket
}//class bracket