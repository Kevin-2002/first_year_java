import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile16
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		String name, input;
		int contin, perm, wage;

		//declare printwriter
		PrintWriter output = new PrintWriter("Payroll.txt");

		//do - while
		do
		{

		//Prompt employee name
		name = JOptionPane.showInputDialog("Enter Employee Name:", "Joe Biden");

		//promt user to enter employee status
		perm = JOptionPane.showConfirmDialog(null, "Is this employee permanent?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);

		//switch
		switch(perm)
		{
			case 0://yes

				//assign wage
				wage = 250;

				//print to console
				System.out.print("\n=========================\nEMPLOYEE: " + name + "\nWAGE: $" + wage + "\n=========================\n");

				//print to file
				output.print("\n=========================\nEMPLOYEE: " + name + "\nWAGE: $" + wage + "\n=========================\n");

				break;
			case 1://no

				//assign wage
				wage = 150;

				//print to console
				System.out.print("\n=========================\nEMPLOYEE: " + name + "\nWAGE: $" + wage + "\n=========================\n");

				//print to file
				output.print("\n=========================\nEMPLOYEE: " + name + "\nWAGE: $" + wage + "\n=========================\n");

				break;
		}//switch

		//prompt them to add another entry
		contin = JOptionPane.showConfirmDialog(null, "Add another record?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);

		}while(contin == 0);

		//to update outputFile
		output.close();

		//to ensure program ends correctly - (from JOptionPane)
		System.exit(0);
	}
}