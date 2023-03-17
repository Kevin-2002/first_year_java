import javax.swing.JOptionPane;

public class Exercise12
{
	public static void main(String[] args)
	{
		//declare variables
		int num1, num2;
		int count = 0;
		int sum = 0;
		String inputStr, operator, outputStr, exit, contin;

		//amount of loop
		inputStr = JOptionPane.showInputDialog("How many numbers do you wish to enter", "6");
		num1 =  Integer.parseInt(inputStr);

		//for loop
		for(int i = 1;i <= num1;i++)
		{
			inputStr = JOptionPane.showInputDialog("enter number " + i + ":", "");
			num2 = Integer.parseInt(inputStr);

			//history
			sum = sum + num2;

			//increment
			count++;
		}

		//output message
		//average
		outputStr = "The average was " + (sum/count) + "\n\n\nYou input " + count + " numbers.";
		JOptionPane.showMessageDialog(null, outputStr, "Message", JOptionPane.INFORMATION_MESSAGE);

		//To ensure progran ends correctly
		System.exit(0);
	}
}