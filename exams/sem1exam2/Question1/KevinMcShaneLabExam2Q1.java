/* Kevin McShane
   Student ID: G00401808
   04/11/2021
   Lab Exam 2 - Software Design and Program Development Year 1
*/

import java.util.Scanner;

public class KevinMcShaneLabExam2Q1
{
	public static void main(String[] args)
	{
		//declare instance of scanner
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		int num1, end;

		//Opening message
		System.out.print("Enter a number to count from: ");

		//promt user to enter a number
		num1 = keyboard.nextInt();

		//calculate end
		end = num1 + 10;

		//for
		for(int i = num1; i <= end; i++)
		{
			//display count
			System.out.printf("Counting up ... %d%n", i);
		}//for
	}//main bracket
}//class bracket