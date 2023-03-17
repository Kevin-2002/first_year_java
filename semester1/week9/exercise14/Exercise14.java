import javax.swing.JOptionPane;

public class Exercise14
{
	public static void main(String[] args)
	{
		//declare variables
		int num1, num2;
		int count = 0;
		String inputStr, input, title;
		String outputStr = "";

		//intial message
		input = JOptionPane.showInputDialog("What word(s) will be output:", "Loop the loop!");

		//title
		title = JOptionPane.showInputDialog("What word(s) will be output:", "This is my title!");

		//amount of loop
		inputStr = JOptionPane.showInputDialog("Multiplication Table\n\n Enter number of times word should be printed: ", "3");
		num1 =  Integer.parseInt(inputStr);

		for(int i = num1; i > 0; i--)
		{
			outputStr = input + " " + i;

			//output message
			JOptionPane.showMessageDialog(null, outputStr, title, JOptionPane.INFORMATION_MESSAGE);

		}
		//To ensure progran ends correctly
		System.exit(0);
	}
}