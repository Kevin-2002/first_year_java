import javax.swing.JOptionPane;

public class Exercise10
{
	public static void main(String[] args)
	{
		//declare variables
		Double num1, num2;
		String inputStr, operator, outputStr, exit, contin;

		//do while
		do
		{
		//joption input number1
		inputStr = JOptionPane.showInputDialog("Enter First Number: ", "45");
		num1 = Double.parseDouble(inputStr);

		//joption input number2
		inputStr = JOptionPane.showInputDialog("Enter Second Number: ", "22");
		num2 = Double.parseDouble(inputStr);

		//input operator
		operator = JOptionPane.showInputDialog("Enter Operator - A for add, or S for subtact: ", "A");

			//if
			if(operator.equals("A") || operator.equals("a"))
			{
				outputStr = "First Number entered: " + num1 + "\nSecond Number entered: " + num2 + "\n" + num1 + " plus " + num2 + " = " + (num1+num2);
				//output message
				JOptionPane.showMessageDialog(null, outputStr, "Message", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(operator.equals("S") || operator.equals("s"))
			{
				outputStr = "First Number entered: " + num1 + "\nSecond Number entered: " + num2 + "\n" + num1 + " minus " + num2 + " = " + (num1-num2);
				//output message
				JOptionPane.showMessageDialog(null, outputStr, "Message", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(operator.equals("D") || operator.equals("d"))
			{
				outputStr = "First Number entered: " + num1 + "\nSecond Number entered: " + num2 + "\n" + num1 + " divided by " + num2 + " = " + (num1/num2);
				//output message
				JOptionPane.showMessageDialog(null, outputStr, "Message", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(operator.equals("M") || operator.equals("m"))
			{
				outputStr = "First Number entered: " + num1 + "\nSecond Number entered: " + num2 + "\n" + num1 + " multiplied by " + num2 + " = " + (num1*num2);
				//output message
				JOptionPane.showMessageDialog(null, outputStr, "Message", JOptionPane.INFORMATION_MESSAGE);
			}

			//ask to exit
			contin = JOptionPane.showInputDialog(null, "Enter Operator - A for add, or S for subtact: , A(type exit to end)");
		}while(!contin.equals("exit"));
		//To ensure progran ends correctly
		System.exit(0);
	}
}