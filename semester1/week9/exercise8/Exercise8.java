import javax.swing.JOptionPane;

public class Exercise8
{
	public static void main(String[] args)
	{
		//declare variables
		int num1, num2;
		String inputStr, outputStr;

		//joption input number1
		inputStr = JOptionPane.showInputDialog("Enter First Number: ", "55");
		num1 = Integer.parseInt(inputStr);

		//joption input number2
		inputStr = JOptionPane.showInputDialog("Enter Second Number: ", "44");
		num2 = Integer.parseInt(inputStr);

		//output message
		outputStr = "First Number entered: " + num1 + "\nSecond Number entered: " + num2 + "\n" + num1 + " plus " + num2 + " = " + (num1+num2);
		JOptionPane.showMessageDialog(null, outputStr, "Message", JOptionPane.INFORMATION_MESSAGE);

		//To ensure progran ends correctly
		System.exit(0);
	}
}