import javax.swing.JOptionPane;
import java.util.*;

public class Exercise2
{
	public static void main(String[] args)
	{
		//declare variables
		int num1 = 55;
		int num2 = 44;
		String outputStr;

		//output
		outputStr = "Number 1 plus Number 2 is : " + (num1+num2);

		//Joption
		JOptionPane.showMessageDialog(null, outputStr, "Message", JOptionPane.INFORMATION_MESSAGE);

		//To ensure progran ends correctly
		System.exit(0);
	}
}