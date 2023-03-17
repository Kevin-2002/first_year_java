import java.util.Scanner;

public class JavaIf10
{
	public static void main(String[] args)
	{

		//Scanner system
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		double cost, discount, quantity;
		int net;

		//input
		System.out.print("Enter quantity being purchased: ");
		quantity  = keyboard.nextDouble();

		//calculations
		discount = (quantity / 10) * 99;
		cost = (quantity * 99) - discount;
		net = (int)quantity * 99;

		//output
		System.out.println("cost is " + cost);

		//if-else statements
		if(discount > 1)
		{
			System.out.println("You received a discount of " + discount);
		}
		else
		{
			System.out.println("There is no discount on this order");
		}
		System.out.println("Cost without discount would normally be " + net);
	}
}