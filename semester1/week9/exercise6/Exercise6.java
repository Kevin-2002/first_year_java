import javax.swing.JOptionPane;

public class Exercise6
{
	public static void main(String[] args)
	{
		//declare variables
		String username, password, address, outputStr;

		//joption input name
		username = JOptionPane.showInputDialog("Enter Your username: ", "Bob");

		//joption input surname
		password = JOptionPane.showInputDialog("Enter Your password: ", "");

		//if statement
		if(password.equals("pass"))
		{
			outputStr = "Welcome " + username + " - User level access granted!";
			JOptionPane.showMessageDialog(null, outputStr, "Message", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(username.equals("Admin") && password.equals("super"))
		{
			outputStr = "Welcome " + username + " - Admin level access granted!";
			JOptionPane.showMessageDialog(null, outputStr, "Message", JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			outputStr = "Access is denied!";
			JOptionPane.showMessageDialog(null, outputStr, "Message", JOptionPane.INFORMATION_MESSAGE);
		}

		//To ensure progran ends correctly
		System.exit(0);
	}
}