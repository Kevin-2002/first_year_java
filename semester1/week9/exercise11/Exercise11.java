import javax.swing.JOptionPane;

public class Exercise11
{
	public static void main(String[] args)
	{
		//declare variables
		Double num1, num2;
		String inputStr, operator, outputStr, exit, contin;

		//input operator
		operator = JOptionPane.showInputDialog("Enter G to convert Sterling to Euros\nor E to convert Euros to Sterling:", "E");

		//amount
		inputStr = JOptionPane.showInputDialog("Enter Amount:", "100");
		num1 =  Double.parseDouble(inputStr);

			//if
			if(operator.equalsIgnoreCase("E"))
			{
				outputStr = num1 + " Euros is " + (num1*0.8391) + "Sterling";
				//output message
				JOptionPane.showMessageDialog(null, outputStr, "Message", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(operator.equalsIgnoreCase("G"))
			{
				outputStr = num1 + " Sterling is " + (num1*1.1917) + "Euros";
			}
		//To ensure progran ends correctly
		System.exit(0);
	}
}