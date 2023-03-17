import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile19
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		String input, name, fileName, surname, occupation, month;
		int birthYear, birthMonth;

		//prompt user to enter first name
		name = JOptionPane.showInputDialog("Enter First name:", "James");

		//generate fileName
		fileName = name + ".txt";

		//declare printwriter
		PrintWriter output = new PrintWriter(fileName);

		//promot user for surname
		surname = JOptionPane.showInputDialog("Enter surname:", "Gosling");

		//prompt occupation
		occupation = JOptionPane.showInputDialog("Enter occupation:", "Computer Scientist");

		//prompt year of birth
		input = JOptionPane.showInputDialog("Year of Birth:", "1955");
		birthYear = Integer.parseInt(input);

		//Enter birthmonth
		input = JOptionPane.showInputDialog("Month of Birth(1 - 12):", "5");
		birthMonth = Integer.parseInt(input);

		//output message saying file generated
		JOptionPane.showMessageDialog(null, "File generated: Gosling - " + fileName, "Message", JOptionPane.INFORMATION_MESSAGE);

		//print to file
		output.printf("========== PERSONNEL FILE ==========\nNAME: %s %s%n====================================\nDATE OF BIRTH: ", name, surname);

		//Switch to convert month
		switch(birthMonth)
		{
			case 1:
				month = "January";
				break;
			case 2:
				month = "February";
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
		}

		//to update outputFile
		output.close();
	}
}