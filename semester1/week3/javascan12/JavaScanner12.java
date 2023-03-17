import java.util.Scanner;

public class JavaScanner12
{
	public static void main(String[] args)
	{
		//Scanner system
		Scanner keyboard = new Scanner(System.in);

		//Declare variable
		String country;
		int population, area, peopleKM;

		//input-output
		System.out.println("Population density calculator");
		System.out.println("-----------------------------");
		System.out.print("Enter country name: ");
		country = keyboard.nextLine();
		System.out.print("Enter country population: ");
		population = keyboard.nextInt();
		System.out.print("Enter country area in square KM: ");
		area = keyboard.nextInt();
		System.out.println("-----------------------------");

		//calculation
		peopleKM = population / area;

		//input-output
		System.out.println("Ireland has " + peopleKM + " people per square kilometer.\n");

	}
}