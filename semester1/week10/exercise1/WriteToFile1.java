import java.io.*;

public class WriteToFile1
{
	public static void main(String[] args) throws IOException
	{
		//declare printwriter
		PrintWriter outputFile = new PrintWriter("MyFile.txt");

		outputFile.println("Hello World!");

		//close
		outputFile.close();
	}
}