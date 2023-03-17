import java.io.*;

public class WriteToFile2
{
	public static void main(String[] args) throws IOException
	{
		//declare printwriter
		PrintWriter outputFile = new PrintWriter("ComputingQuote.txt");

		outputFile.println("The Internet?");
		outputFile.println("We arenot interested in it.");
		outputFile.println("Bill Gates, 1993.");

		//close
		outputFile.close();
	}
}