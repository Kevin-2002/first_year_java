import java.io.*;

public class WriteToFile3
{
	public static void main(String[] args) throws IOException
	{
		//declare printwriter
		PrintWriter outputFile = new PrintWriter("WhatToDo.txt");

		outputFile.print("A computer will di what you tell it to do,\nbut that may be much different from what you had in mind.\nJoseph Weinzenbaum");

		//close
		outputFile.close();
	}
}