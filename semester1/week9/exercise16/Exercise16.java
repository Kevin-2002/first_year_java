import javax.swing.JOptionPane;

public class Exercise16
{
	public static void main(String[] args)
	{
		//declare variables
		int choice;

		//choice
		choice = JOptionPane.showConfirmDialog(null, "Was the java programming language first released in1995?", "yes or no?", JOptionPane.YES_NO_OPTION);

		//if
		if(choice == 0)
		{
			JOptionPane.showMessageDialog(null, "Yes, That's correct! The java programming languaged was first released in 1995.", "message", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(choice == 1)
		{
			JOptionPane.showMessageDialog(null, "Sorry, wrong answer try again.", "message", JOptionPane.INFORMATION_MESSAGE);
		}

		//To ensure progran ends correctly
		System.exit(0);
	}
}