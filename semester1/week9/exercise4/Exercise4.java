import javax.swing.JOptionPane;

public class Exercise4
{
	public static void main(String[] args)
	{
		//declare variables
		String inputStr, outputStr;

		//joption input
		inputStr = JOptionPane.showInputDialog("Enter Your name", "Joe Biden");

		//output
		outputStr = "Hello " + inputStr + "\n\n\n\nThis was created using swing!";

		//Joption message
		JOptionPane.showMessageDialog(null, outputStr, "Message", JOptionPane.INFORMATION_MESSAGE);

		//To ensure progran ends correctly
		System.exit(0);
	}
}