import java.io.*;

public class WriteToFile10
{
	public static void main(String[] args) throws IOException
	{
		//declare filewriter - variables
		FileWriter fwriter = new FileWriter("MyFile.txt", true);

		//declaer printwriter
		PrintWriter outputFile = new PrintWriter(fwriter);

		//output to file
		outputFile.println("This is using filewriter!");

		outputFile.println("This is an additional line of text!!!");

		//close
		outputFile.close();
	}
}