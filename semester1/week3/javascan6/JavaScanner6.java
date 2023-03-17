import java.util.Scanner;

public class JavaScanner6
{
	public static void main(String[] args)
	{
		//Scanner system
		Scanner keyboard = new Scanner(System.in);
		//declare constant
		final double VAT_RATE = .23;
		double vat, price, finalPrice;

		//Prompt/input price
		System.out.print("Enter price of product: ");
		price = keyboard.nextDouble();

		//Calculations
		vat = price * VAT_RATE;
		finalPrice = price + vat;

		//Output
		System.out.println("_________________________________________________________________");
		System.out.println("Price of product is: " + price);
		System.out.println("VAT at 23% is: " + vat);
		System.out.println("\n\nTotal Cost: " + finalPrice);
	}
}