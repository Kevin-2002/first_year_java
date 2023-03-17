import javax.swing.JOptionPane;

public class Exercise15
{
	public static void main(String[] args)
	{
		//declare variables
		int num1, num2, choice;
		int count = 0;
		String inputStr;
		String outputStr = "";

		//choice
		choice = JOptionPane.showConfirmDialog(null, "Click yes or no", "choose an option", JOptionPane.YES_NO_CANCEL_OPTION);

		//if
		if(choice == 0)
		{
			JOptionPane.showMessageDialog(null, "You clicked Yes!", "message", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(choice == 1)
		{
			JOptionPane.showMessageDialog(null, "You clicked no!", "message", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(choice == 2)
		{
			JOptionPane.showMessageDialog(null, "You clicked cancel!", "message", JOptionPane.INFORMATION_MESSAGE);
		}

		//To ensure progran ends correctly
		System.exit(0);
	}
}