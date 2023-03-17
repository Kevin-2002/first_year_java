import javax.swing.JOptionPane;

public class Exercise7
{
	public static void main(String[] args)
	{
		//declare variables
		int wage;
		char bonus;
		String inputStr, outputStr;

		//joption input name
		inputStr = JOptionPane.showInputDialog("Enter Employee current weekly wage: ", "350");
		wage = Integer.parseInt(inputStr);

		//joption input surname
		inputStr = JOptionPane.showInputDialog("Enter Employee grade(A, B or C): ", "A");

		//switch
		switch(inputStr)
		{
			case "A":
			case "a":
				outputStr = "Grade A Employee: This weeks wage plus bonus is " + (wage+100);
				break;
			case "B":
			case "b":
				outputStr = "Grade B Employee: This weeks wage plus bonus is " + (wage+50);
				break;

			case "C":
			case "c":
				outputStr = "Grade C Employee: This weeks wage plus bonus is " + (wage+15);
				break;
			default:
				outputStr = "Employee: This weeks wage is " + wage;
				break;
		}
		//output message
		JOptionPane.showMessageDialog(null, outputStr, "Message", JOptionPane.INFORMATION_MESSAGE);

		//To ensure progran ends correctly
		System.exit(0);
	}
}