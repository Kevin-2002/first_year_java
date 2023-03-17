import java.util.Scanner;

public class Array15
{
	public static void main(String[] args)
	{
		//declare keyboard and variables
		Scanner keyboard = new Scanner(System.in);
		int index, hours, pay;

		//declare the array
		int[] arrayID = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
		int[] arrayHours = new int[7];
		double[] arrayPay = new double[7];

		//display employee IDs
		for()
		{

		}

		//prompt the user to edit an index
		System.out.println("Choose an index to edit:");
		index = keyboard.nextInt();

		//display employee ID
		System.out.printf("Employee ID: %d%n", arrayID[index]);

		//prompt hours worked
		System.out.println("Enter hours worked:");
		hours = keyboard.nextInt();

		//prompt pay rate
		System.out.println("Enter hourly pay rate:");
		pay = keyboard.nextInt();
	}//main
}