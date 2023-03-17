import javax.swing.JOptionPane;

public class Exercise9
{
	public static void main(String[] args)
	{
		//declare variables
		int num1, num2, output;
		String inputStr, operator;

		//joption input number1
		inputStr = JOptionPane.showInputDialog("Enter First Number: ", "45");
		num1 = Integer.parseInt(inputStr);

		//joption input number2
		inputStr = JOptionPane.showInputDialog("Enter Second Number: ", "22");
		num2 = Integer.parseInt(inputStr);

		//input operator
		operator = JOptionPane.showInputDialog("Enter Operator - A for add, or S for subtact: ", "A");

		//if
		if(operator.equals("A") || operator.equals("a"))
		{
			output = (num1+num2);

		//output message
		JOptionPane.showMessageDialog(null, output, "Message", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(operator.equals("S") || operator.equals("s"))
		{
			output = (num1-num2);

		//output message
		JOptionPane.showMessageDialog(null, output, "Message", JOptionPane.INFORMATION_MESSAGE);
		}

		//To ensure progran ends correctly
		System.exit(0);
	}
}