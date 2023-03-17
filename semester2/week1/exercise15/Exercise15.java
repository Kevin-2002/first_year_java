import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;

public class Exercise15
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		int dob, age;
		String firstName, surname;

		//specify file to use
		File myFile = new File("datain.txt");

		//Use scanner to read from the file
		Scanner inputFile = new Scanner(myFile);

		//read from file
		//names
		firstName = inputFile.next();
		surname = inputFile.next();
		//date of birth
		dob = inputFile.nextInt();

		//calculate age
		age = dob - 2022;

		//text
		System.out.printf("Name: %s, %s  -  Age:%d%n\n\n\n", surname, firstName, age);

		//file close
		inputFile.close();
	}
}