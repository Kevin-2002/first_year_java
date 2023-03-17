import java.util.*;
import javax.swing.JOptionPane;

public class SampleExam2Q4
{
	public static void main(String[] args)
	{
		//declare constant
		final double ONE_NIGHT = 70.0;
		final double TWO_NIGHTS = 180.0;
		final double THREE_NIGHTS = 240.0;
		final double NIGHTLY_RATE = 70.0;

		//declare variables
		String firstName, surname, input, filename, extrasCost = "", logfileContents = "", invoiceString;

		int nights, invoiceNumber, choice, invoiceCount = 1;

		double total, extras = 0, extraSum = 0, finalTotal, allStaysTotal = 0;

		//Generate random number for invoices
		Random randomNumber = new Random();
		invoiceNumber = randomNumber.nextInt(500) + 5000;

		//output welcome message
		JOptionPane.showMessageDialog(null , "\n\nWelcome to the\n---------------\nJAVA HOTEL\n---------------\n\nGUEST CHECKOUT\nBILLING SYSTEM\n---------------", "message", JOptionPane.INFORMATION_MESSAGE);

		//do while loop to allow user to enter in customer derails - 5 invoices
		do
		{
			//update invoice string
			invoiceString = "JH-" + invoiceNumber;

			//promt-input firstname, surname and nights
			firstName = JOptionPane.showInputDialog("Enter First Name");
			surname = JOptionPane.showInputDialog("Enter Surname");
			input = JOptionPane.showInputDialog("How many nights was your stay?");
			nights = Integer.parseInt(input);

			//calculate nightly cost - can use if
			switch(nights)
			{
				case 1:
					total = ONE_NIGHT;
					break;
				case 2:
					total = TWO_NIGHTS;
					break;
				case 3:
					total = THREE_NIGHTS;
					break;
				default:
					total = nights * NIGHTLY_RATE;
					break;
			}//switch
			//output basic informatioin
			JOptionPane.showMessageDialog(null, "", "message", JOptionPane.INFORMATION_MESSAGE);


			//Create a file in folder invoices
			fileName = "Invoices/" + firstName + surname + ".txt";
			//write out to the invoices file

		}while
	}
}