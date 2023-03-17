import javax.swing.JOptionPane;

public class Exercise17
{
	public static void main(String[] args)
	{
		//declare variables
		int choice;

		//question 1
		choice = JOptionPane.showConfirmDialog(null, "Was the java programming language developed in 1995 by Sun Microsystems?", "yes or no?", JOptionPane.YES_NO_OPTION);

		//if
		if(choice == 0)
		{
			JOptionPane.showMessageDialog(null, "Yes, That's correct!", "message", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(choice == 1)
		{
			JOptionPane.showMessageDialog(null, "Sorry, wrong answer try again.", "message", JOptionPane.INFORMATION_MESSAGE);
		}

		//question 2
		choice = JOptionPane.showConfirmDialog(null, "Is Java an object-oriented language?", "yes or no?", JOptionPane.YES_NO_OPTION);

		//if
		if(choice == 0)
		{
			JOptionPane.showMessageDialog(null, "Yes, That's correct!", "message", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(choice == 1)
		{
			JOptionPane.showMessageDialog(null, "Sorry, wrong answer try again.", "message", JOptionPane.INFORMATION_MESSAGE);
		}

		//question 3



		//To ensure progran ends correctly
		System.exit(0);
	}
}