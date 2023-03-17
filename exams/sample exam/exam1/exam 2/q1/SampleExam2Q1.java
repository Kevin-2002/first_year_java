import java.util.*;
import javax.swing.JOptionPane;

public class SampleExam2Q1
{
	public static void main(String[] args)
	{
		//declare variables
		Scanner keyboard = new Scanner(System.in);
		int increment = 0;

		//intro message
		System.out.print("Question 1\nEnter a number for each loop increment: ");

		//prompt user to enter incrementation value
		increment = keyboard.nextInt();

		//for loop
		for(int i = increment; i <= 100;)
		{
			System.out.printf("loop %d%n", i);
			i = i + increment;
		}//for
	}
}