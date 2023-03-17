import javax.swing.JOptionPane;

public class Exercise3
{
	public static void main(String[] args)
	{
		//declare variables
		String inputStr, outputStr;

		//joption input
		inputStr = JOptionPane.showInputDialog("Enter name", "Kevin");

		//output
		outputStr = "Hello " + inputStr + "\n\nWelcome to the program!";

		//Joption message
		JOptionPane.showMessageDialog(null, outputStr, "Message", JOptionPane.INFORMATION_MESSAGE);

		//To ensure progran ends correctly
		System.exit(0);
	}
}