import java.util.Scanner;

public class Array12
{
	public static void main(String[] args)
	{
		//declare keyboard and variables
		Scanner keyboard = new Scanner(System.in);
		String[] company = {"Microsoft", "Apple", "Oracle", "Amazon"};
		String[] founder = {"Bill Gates", "Steve Jobs", "Larry Ellison", "Jeff Bezos"};
		int[] numEmployees = {166475, 147000, 135000, 129800};
		int[] yearFounded = {1975, 1976, 1977, 1998};
		int choice = 0;

		//text
		System.out.println("VIEW COMPANY INFORMATION");

		//output array values
		do
		{
			System.out.println("CHOOSE FROM ONE OF THE OPTIONS BELOW ");
			System.out.println("Index 0: Microsoft");
			System.out.println("Index 1: Appple");
			System.out.println("Index 2: Oracle");
			System.out.println("Index 3: Amazon");
			do
			{
				System.out.print("Enter option(or -1 to quit): ");
				choice = keyboard.nextInt();
			}while(choice < -1 || choice > 3);

			if(choice != -1)
			{
				System.out.println("===================================");
				System.out.println("COMPANY: " + company[choice]);
				System.out.println("FOUNDER: " + founder[choice]);
				System.out.println("NUMBER OF EMPLOYEES: " + numEmployees[choice]);
				System.out.println("YEAR FOUNDED: " + yearFounded[choice]);
				System.out.println("YEAR ACTIVE: " + (2022 - yearFounded[choice]));
				System.out.println("===================================");
			}
		}while(choice != -1);
	}//main
}