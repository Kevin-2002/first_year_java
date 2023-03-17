/* Kevin McShane
   Student ID: G00401808
   26/04/2022
   Lab Exam 4 - Software Design and Program Development Year 1
*/
import java.util.Scanner;

public class KevinMcShaneQuestion2
{
	public static void main(String[] args)
	{
		//declare variables
		int customer, sum = 0, highestCustomers = 0, highDay = 0;

		//declare keyboard
		Scanner keyboard = new Scanner(System.in);

		//create array
		int[] customers = new int[7];

		//output using for
		for(int i = 0; i < customers.length; i++)
		{
			//output every day
			System.out.printf("Enter number of customers for day %d: ", (i+1));

			//prompt user to enter customer count
			customer = keyboard.nextInt();

			//calculate sum
			sum = sum + customer;

			if(customer >= highestCustomers)
			{
				highestCustomers = customer;
				highDay = (i+1);
			}
		}

		//output total customers
		System.out.printf("\nTotal customers for the week was %d%n\n", sum);
		System.out.printf("Day with the most customers was day %d which had %d customers.", highDay, highestCustomers);



	}//main()
}//class bracket