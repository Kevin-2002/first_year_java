import javax.swing.JOptionPane;

public class Exercise5
{
	public static void main(String[] args)
	{
		//declare variables
		String name1, name2, address, outputStr;

		//joption input name
		name1 = JOptionPane.showInputDialog("Enter Your name", "Joe");

		//joption input surname
		name2 = JOptionPane.showInputDialog("Enter Your surname", "Biden");

		//joption input address
		address = JOptionPane.showInputDialog("Enter Your address", "The White House");

		//output
		outputStr = "First Name: " + name1 + "\nSurname: " + name2 + "\n***********\n\nAddress: " + address;

		//Joption message
		JOptionPane.showMessageDialog(null, outputStr, "Message", JOptionPane.INFORMATION_MESSAGE);

		//To ensure progran ends correctly
		System.exit(0);
	}
}