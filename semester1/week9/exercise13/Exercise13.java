import javax.swing.JOptionPane;

public class Exercise13
{
	public static void main(String[] args)
	{
		//declare variables
		int num1, num2;
		int count = 0;
		int sum = 0;
		String inputStr;
		String outputStr = "";

		//amount of loop
		inputStr = JOptionPane.showInputDialog("Multiplication Table\n\n Enter a number to generate nultiplication tables for: ", "15");
		num1 =  Integer.parseInt(inputStr);

		for(int i = 1; i <= 10; i++)
		{
			outputStr += num1 + " times " + i + " is " + (num1*i) + "\n";
		}

		//output message
		JOptionPane.showMessageDialog(null, outputStr, + num1 + " times tables", JOptionPane.INFORMATION_MESSAGE);

		//To ensure progran ends correctly
		System.exit(0);
	}
}