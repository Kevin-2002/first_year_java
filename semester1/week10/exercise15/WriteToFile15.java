import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile15
{
	public static void main(String[] args) throws IOException
	{
		//declare printwriter
		PrintWriter outputFile = new PrintWriter("Receipt.txt");

		//delcare variables
		String input, drink;
		double quantity, price;

		//prompt user to choose drink
		drink = JOptionPane.showInputDialog("Enter product(Coke/Pepsi/Evian)", "Coke");

		//promt quantity - parse
		input = JOptionPane.showInputDialog("Enter Quantity:", "4");
		quantity = Integer.parseInt(input);

		//switch
		switch(drink)
		{
			case "Coke":

				//declare price
				price = 1;

				//print output to file
				outputFile.printf("-----------------------\nPURCHASE: %s%nPrice: $%.2f%nQuantity: %.0f%nTotal Cost: %.2f%n-----------------------", drink, price, quantity, (price * quantity));

				break;
			case "Pepsi":

				//declare price
				price = 0.95;

				//print output to file
				outputFile.printf("-----------------------\nPURCHASE: %s%nPrice: $%.2f%nQuantity: %.0f%nTotal Cost: %.2f%n-----------------------", drink, price, quantity, (price * quantity));

				break;
			case "Evian":

				//declare price
				price = 0.75;

				//print output to file
				outputFile.printf("-----------------------\nPURCHASE: %s%nPrice: $%.2f%nQuantity: %.0f%nTotal Cost: %.2f%n-----------------------", drink, price, quantity, (price * quantity));

				break;
			default:

				//print output to file
				outputFile.print("-----------------------\nNot a valid option\n-----------------------");

				break;
		}//switch

		//message - RECEIPT COMPLETE!
		JOptionPane.showMessageDialog(null, "RECEIPT COMPLETE!", "Message", JOptionPane.INFORMATION_MESSAGE);

		//to update outputFile
		outputFile.close();

		//to ensure program ends correctly - (from JOptionPane)
		System.exit(0);
	}
}