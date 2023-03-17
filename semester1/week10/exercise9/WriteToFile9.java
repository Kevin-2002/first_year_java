import java.io.*;

public class WriteToFile9
{
	public static void main(String[] args) throws IOException
	{
		//declare printwriter - variables
		FileWriter fwriter = new FileWriter("MyFile.txt", true);

		//declaer printwriter
		PrintWriter outputFile = new PrintWriter(fwriter);

		//output to file
		outputFile.println("This is using filewriter!");

		//close
		outputFile.close();
	}
}