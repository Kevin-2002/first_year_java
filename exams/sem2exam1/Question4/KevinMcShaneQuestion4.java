/* Kevin McShane
   Student ID: G00401808
   01/03/2022
   Lab Exam 3 - Software Design and Program Development Year 1
*/
import java.util.Scanner;

public class KevinMcShaneQuestion4
{
	public static void main(String[] args)
	{
		//delcare keyboard and declare variables
		Scanner keyboard = new Scanner(System.in);
		String garment, brand;
		float price;
		char available;

		//prompt user to enter details for clothing5
		System.out.println("Enter details for object 5");
		System.out.print("Enter garment type: ");
		garment = keyboard.nextLine();
		System.out.print("Enter brand: ");
		brand = keyboard.nextLine();
		System.out.print("Enter item price: ");
		price = keyboard.nextFloat();
		System.out.print("Is item available? Y or N: ");
		available = keyboard.next().charAt(0);

		//create objects
		Clothes c1 = new Clothes("Trousers");
		Clothes c2 = new Clothes("Shirt", "Calvin Klein", 34.99f, 'y');
		Clothes c3 = new Clothes(32.99f, false);
		Clothes c4 = new Clothes();
		Clothes c5 = new Clothes(garment, brand, price, available);

		//output
		System.out.println("");
		System.out.printf("Object 1\nGARMENT: %s%nBRAND:   %s%nPRICE:   %.1f%nSTOCK:   %s%n\n", c1.getGarment(), c1.getBrand(), c1.getPrice(), c1.getAvailable());
		System.out.printf("Object 2\nGARMENT: %s%nBRAND:   %s%nPRICE:   %.2f%nSTOCK:   %s%n\n", c2.getGarment(), c2.getBrand(), c2.getPrice(), c2.getAvailable());
		System.out.printf("Object 3\nGARMENT: %s%nBRAND:   %s%nPRICE:   %.2f%nSTOCK:   %s%n\n", c3.getGarment(), c3.getBrand(), c3.getPrice(), c3.getAvailable());
		System.out.printf("Object 4\nGARMENT: %s%nBRAND:   %s%nPRICE:   %.1f%nSTOCK:   %s%n\n", c4.getGarment(), c4.getBrand(), c4.getPrice(), c4.getAvailable());
		System.out.printf("Object 5\nGARMENT: %s%nBRAND:   %s%nPRICE:   %.2f%nSTOCK:   %s%n", c5.getGarment(), c5.getBrand(), c5.getPrice(), c5.getAvailable());
	}//main()
}//class bracket