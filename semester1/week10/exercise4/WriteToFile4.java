import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile4
{
	public static void main(String[] args) throws IOException
	{
		//declare printwriter - variables
		PrintWriter outputFile = new PrintWriter("MyNewFile.txt");
		String fileName;

		//Joption prompt filename
		fileName = JOptionPane.showInputDialog("Enter file name: ", "MyNewFile.txt");

		outputFile.println("This is Java!");

		//close
		outputFile.close();
	}
}