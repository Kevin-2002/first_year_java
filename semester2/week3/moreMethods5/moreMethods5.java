import java.util.Scanner;
import javax.swing.JOptionPane;

public class moreMethods5
{
	public static void main(String[] args)
	{
		//declare var
		String inputStr;
		double wholeSale, markUp;

		//prompt user to enter an items wholesale
		inputStr = JOptionPane.showInputDialog("Enter the item's wholesale cost.", "100");
		wholeSale = Integer.parseInt(inputStr);

		inputStr = JOptionPane.showInputDialog("Enter the item's markup percentage.", "25");
		markUp = Integer.parseInt(inputStr);

		calculateRetail(wholeSale, markUp);
	}

	public static void calculateRetail(double wholeSale, double markUp)
	{
		JOptionPane.showMessageDialog(null, "The item's retail price is eur " + ((wholeSale*(100+markUp))/100));
	}
}